#!/usr/bin/env bash
set -euo pipefail

repo_root="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
verify_root="$(mktemp -d)"
trap 'rm -rf "$verify_root"' EXIT

compile_tutorial() {
    local tutorial="$1"
    local output="$verify_root/${tutorial//\//_}"
    mkdir -p "$output"
    javac -d "$output" "$repo_root/$tutorial"/*.java
}

compile_tutorial tutorial_1
compile_tutorial tutorial_2
compile_tutorial tutorial_3-4
compile_tutorial tutorial_5
compile_tutorial tutorial_6
compile_tutorial tutorial_7
compile_tutorial tutorial_8-9
compile_tutorial tutorial_10

java -cp "$verify_root/tutorial_1" HelloWorld | grep -F "Hello, World!"
java -cp "$verify_root/tutorial_1" StudentGrade | grep -F "Grade: A"
java -cp "$verify_root/tutorial_2" Main | grep -F "MOHAMMED is taking an exam."
java -cp "$verify_root/tutorial_3-4" tutorial_3_4.Main | grep -F "I am a lecturer."
java -cp "$verify_root/tutorial_5" Main | grep -F "Programme : BIT"
java -cp "$verify_root/tutorial_6" Main | grep -F "Department  : Faculty of Information Technology"
java -cp "$verify_root/tutorial_7" Main | grep -F "Store food & beverages..."

cp "$repo_root/tutorial_8-9/Main.java" "$verify_root/Main.java"
(cd "$verify_root" && javac Main.java && printf 'drink water\ncompleting AI course\ndrink water again\n' | java Main) \
    | grep -F "Tasks saved successfully."
grep -F "drink water" "$verify_root/task.txt"

javac -cp "$verify_root/tutorial_10" -d "$verify_root/tutorial_10" "$repo_root/tests/QuestionsTest.java"
java -cp "$verify_root/tutorial_10" QuestionsTest

if find "$repo_root" -name '*.class' -print -quit | grep -q .; then
    echo "Generated .class file found in repository" >&2
    exit 1
fi

echo "All tutorials verified successfully."
