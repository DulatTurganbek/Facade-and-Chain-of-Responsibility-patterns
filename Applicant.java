package Lab7;
public abstract class Applicant {

    private Applicant applicant;
    private boolean done;

    public void setApplicant(Applicant applicant, boolean done) {
        this.applicant = applicant;
        this.done = done;
    }

    public void doWork(){
        if(done){
            nextStep();
            System.out.println("This step is already done");
        }else{
            System.out.println("Good job :)");
            System.out.println("This step was last for you");
            return;
        }
        if(applicant!=null){
            applicant.doWork();
        }
    }

    public abstract void nextStep();
}
