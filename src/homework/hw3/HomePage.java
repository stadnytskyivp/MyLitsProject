package homework.hw3;

public class HomePage {

    private String homeURL = "http://lits.ua/";
    private String mobileNum = "+380678266292";
    private String codeSchool = "Code School";
    private String qaSchool = "QA School";
    private String logoLITS = "lits logo";
    private String lvivItSchool = "Lviv it school";
    private String becomeStudent = "Become a student";
    private String myCity = "Lviv";

    public HomePage(String homeURL){

        this.homeURL = homeURL;

    }
    public HomePage(){ }


    public String btnClick(String btnName){
        return "click on "+btnName;
    }

    public void openURL() { System.out.println(homeURL); }

    public void logoLITSClick() {
        setHomeURL("http://lits.ua/");
        System.out.println(btnClick(logoLITS));
    }

    public void btnLvivItSchool(){ System.out.println(btnClick(lvivItSchool)); }

    public void selectSchool(int listIndex){
        switch (listIndex) {
            case (1):
                System.out.println(btnClick(codeSchool));
                break;
            case (2):
                System.out.println(btnClick(qaSchool));
                break;
            default:
                System.out.println("you don't need that!");
                break;
        }
    }

    public void btnBecomeAStudent(){ System.out.println(btnClick(becomeStudent)); }

    public void btnClickOnCity(){ System.out.println(btnClick(myCity)); }
    
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
        System.out.println(btnClick(myCity));
    }

    public String getMobileNum(){
        return mobileNum;
    }

    public String getLogoLITS() {
        return logoLITS;
    }

    public void setMyCity(String myCity) {
        this.myCity = myCity;
    }

    public String getMyCity() {
        return myCity;
    }
    public String getHomeURL() {
        return homeURL;
    }
    public void setHomeURL(String homeURL) {
        this.homeURL = homeURL;
    }
    public String getCodeSchool() { return codeSchool; }
    public String getQaSchool() { return qaSchool; }
}
