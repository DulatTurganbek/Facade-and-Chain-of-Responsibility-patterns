package Lab7;
public class Facade {
    Applicant Consultation = new Consultation();
    Applicant submit = new Submit();
    Applicant english = new English();
    Applicant Kazakh = new Kazakh();
    Applicant mainTest = new MainTest();
    Applicant ending = new Success();

    public void operations(){

        Consultation.setApplicant(submit, true);

        submit.setApplicant(english, true);

        english.setApplicant(Kazakh, true);
        Kazakh.setApplicant(mainTest, true);
        mainTest.setApplicant(ending, true);

        Consultation.doWork();

    }
}

