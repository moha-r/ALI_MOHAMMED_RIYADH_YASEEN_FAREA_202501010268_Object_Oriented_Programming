public class Questions {

    private String question;
    private String option1;
    private String option2;
    private String answer;

    public Questions() {

        // constructor
        question = "Which keyword creates an object?";
        option1 = "new";
        option2 = "class";
        answer = "new";
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}
