package Behavioural.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        InterviewHandler firstInterviewHandler = new FirstInterviewHandler();
        InterviewHandler secondInterviewHandler = new SecondInterviewHandler();
        InterviewHandler hrInterviewHandler = new HRInterviewHandler();

        firstInterviewHandler.setNextHandler(secondInterviewHandler);
        secondInterviewHandler.setNextHandler(hrInterviewHandler);

        Candidate candidate = new Candidate();
        candidate.setPassedFirstInterview(true);
        candidate.setPassedSecondInterview(true);
        candidate.setPassedHRInterview(true);

        Candidate candidate2 = new Candidate();
        candidate2.setPassedFirstInterview(true);
        candidate2.setPassedSecondInterview(false);
        candidate2.setPassedHRInterview(true);

        firstInterviewHandler.conductInterview(candidate);

        firstInterviewHandler.conductInterview(candidate2);
    }
}