package labs_examples.exception_handling.labs;

public class AnswerToLife extends Exception {

    @Override
    public String toString() {
        return "That is NOT the secret to life!";
    }

}
