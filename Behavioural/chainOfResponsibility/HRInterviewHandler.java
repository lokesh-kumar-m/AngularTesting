package Behavioural.chainOfResponsibility;

class HRInterviewHandler implements InterviewHandler {
    private InterviewHandler nextHandler;

    @Override
    public void setNextHandler(InterviewHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void conductInterview(Candidate candidate) {
        // Conduct the HR round
        if (candidate.isPassedHRInterview()) {
            System.out.println("Candidate passed the HR round.");
            if (nextHandler != null) {
                nextHandler.conductInterview(candidate);
            }
        } else {
            System.out.println("Candidate failed the HR round.");
        }
    }
}
