package Behavioural.chainOfResponsibility;

class FirstInterviewHandler implements InterviewHandler {
    private InterviewHandler nextHandler;

    @Override
    public void setNextHandler(InterviewHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void conductInterview(Candidate candidate) {
        // Conduct the first interview
        if (candidate.isPassedFirstInterview()) {
            System.out.println("Candidate passed the first interview.");
            if (nextHandler != null) {
                nextHandler.conductInterview(candidate);
            }
        } else {
            System.out.println("Candidate failed the first interview.");
        }
    }
}
