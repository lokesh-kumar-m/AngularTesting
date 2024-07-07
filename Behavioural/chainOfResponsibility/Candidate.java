package Behavioural.chainOfResponsibility;

class Candidate {
    private boolean passedFirstInterview;
    private boolean passedSecondInterview;
    private boolean passedHRInterview;

    public boolean isPassedFirstInterview() {
        return passedFirstInterview;
    }

    public void setPassedFirstInterview(boolean passedFirstInterview) {
        this.passedFirstInterview = passedFirstInterview;
    }

    public boolean isPassedSecondInterview() {
        return passedSecondInterview;
    }

    public void setPassedSecondInterview(boolean passedSecondInterview) {
        this.passedSecondInterview = passedSecondInterview;
    }

    public boolean isPassedHRInterview() {
        return passedHRInterview;
    }

    public void setPassedHRInterview(boolean passedHRInterview) {
        this.passedHRInterview = passedHRInterview;
    }
}