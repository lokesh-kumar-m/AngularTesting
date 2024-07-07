package Behavioural.chainOfResponsibility;

class SecondInterviewHandler implements InterviewHandler {
    private InterviewHandler nextHandler;

    @Override
    public void setNextHandler(InterviewHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void conductInterview(Candidate candidate) {
        // Conduct the second interview
        if (candidate.isPassedSecondInterview()) {
            System.out.println("Candidate passed the second interview.");
            if (nextHandler != null) {
                nextHandler.conductInterview(candidate);
            }
        } else {
            System.out.println("Candidate failed the second interview.");
        }
    }
}
