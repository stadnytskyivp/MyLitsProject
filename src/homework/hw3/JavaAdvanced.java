package homework.hw3;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;

public class JavaAdvanced extends HomePage {

    private String title = "Java Advanced";
    private String courseDuration = "3 month";
    private String intensity = "2 times a week";
    private String startingDate = "14.01.2020";
    private int price = 9900;
    private String curriculum;


    public JavaAdvanced(String homeURL,String curriculum){
        super(homeURL);
        this.curriculum = curriculum;
    }
    public JavaAdvanced(){}


    public void openURL() { System.out.println(getHomeURL()); }

    @Override
    public void logoLITSClick() { System.out.println(btnClick(getLogoLITS() ));}

    public void  btnCurriculum(){ System.out.println(btnClick(curriculum)); }


}
