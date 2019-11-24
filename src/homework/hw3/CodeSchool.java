package homework.hw3;

public class CodeSchool extends HomePage{

    private String title = "CODE SCHOOL";
    private int coursesCount = 9;
    private int teachersCount = 13;
    private int graduatesCount = 273;
    private String javaAdvancedDetails = "Java Advanced Details";


    public CodeSchool(String homeURL){
        super(homeURL);
    }
    public CodeSchool(){}


    public void btnDetails(){
        System.out.println(btnClick(javaAdvancedDetails));
    }

    public void openURL() { System.out.println(getHomeURL()); }

    @Override
    public void logoLITSClick() { System.out.println(btnClick(getLogoLITS()+" "+ getHomeURL() ));}

    @Override
    public void selectSchool(int listIndex){
        switch (listIndex) {
            case (1):
                System.out.println(btnClick(getCodeSchool()));
                break;
            case (2):
                System.out.println(btnClick(getQaSchool()));
                break;
            default:
                System.out.println("you don't need that!");
                break;
        }
    }

    @Override
    public void btnBecomeAStudent(){ System.out.println("go to FEEDBACK FORM"); }

    @Override
    public void chooseYourCity(int listIndex){
        switch (listIndex) {
            case (1):
                setMyCity("Lviv");
                break;
            case (2):
                setMyCity("Kiyv");
                break;
            case (3):
                setMyCity("Kharkiv");
                break;
            default:
                System.out.println("you don't need that!");
                break;
        }
        System.out.println(btnClick(getMyCity()));
    }
}
