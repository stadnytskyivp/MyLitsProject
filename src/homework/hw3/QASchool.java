package homework.hw3;

public class QASchool extends HomePage {

    private String title = "QA SCHOOL";
    private int coursesCount = 3;
    private int teachersCount = 7;
    private int graduatesCount = 1056;

    public QASchool(String homeURL){
        super(homeURL);
    }
    public QASchool(){}

    public void openURL() { System.out.println(getHomeURL()); }

    @Override
    public void logoLITSClick() { System.out.println("go back to main page"); }


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
