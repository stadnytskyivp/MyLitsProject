package homework.hw3;

public class HomePage {

    private String mobileNum = "+380678266292";

    public HomePage(String mobileNum){
        this.mobileNum = mobileNum;
    }
    public HomePage(){}



    public void labelLITSClick() { System.out.println("go back to main page"); }

    public void LvivItSchool(int listIndex){
        switch (listIndex) {
            case  (1):
                System.out.println("Code School");
                break;
            case (2):
                System.out.println("QA School");
                break;
            default:
                System.out.println("you don't need that!");
                break;
        }

    }

    public void BtnBecomeAStudent(){ System.out.println("go to FEEDBACK FORM"); }

    public void cityPickList(int listIndex){
        switch (listIndex) {
            case (1):
                System.out.println("Lviv");
                break;
            case (2):
                System.out.println("Kiyv");
                break;
            case (3):
                System.out.println("Kharkiv");
                break;
        }
    }

    public String getMobileNum(){
        return mobileNum;
    }
}
