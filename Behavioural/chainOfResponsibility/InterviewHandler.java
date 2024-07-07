package Behavioural.chainOfResponsibility;

interface InterviewHandler {
    void setNextHandler(InterviewHandler nextHandler);
    void conductInterview(Candidate candidate);
}