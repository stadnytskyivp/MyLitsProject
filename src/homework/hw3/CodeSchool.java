package homework.hw3;

public class CodeSchool extends HomePage{

    public CodeSchool(String mobileNum){
        super(mobileNum);
    }


    @Override
    public void labelLITSClick() { System.out.println("go back to main page"); }

    @Override
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
    @Override
    public void BtnBecomeAStudent(){ System.out.println("go to FEEDBACK FORM"); }

    @Override
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
}