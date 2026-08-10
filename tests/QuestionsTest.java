public class QuestionsTest {
    public static void main(String[] args) {
        Questions question = new Questions();

        if (!"Which keyword creates an object?".equals(question.getQuestion())) {
            throw new AssertionError("Unexpected quiz question");
        }
        if (!question.isCorrect("new")) {
            throw new AssertionError("The correct answer must be accepted");
        }
        if (question.isCorrect("class")) {
            throw new AssertionError("The wrong answer must be rejected");
        }

        System.out.println("Questions test passed");
    }
}
