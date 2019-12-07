package homework.hw3;

/*H/W
http://lits.ua/
Заходимо на сайт літсу і ви маєте описати класами сторінки сайту, в основній сторінці ви маєте вивсети методи і поля
 які відображаються всюди, незалежно клікнете, і зайшовши на певно сторінку ви маєете  описати її відповідно.
Статичний текст у нас буде правет змінною, якшо це кнопка чи клік це відображаємо методом. Описати головну сторінку +
Code School i QA School використовуючи ооп
P.S якшо це метод який робить клік то просто всередині нього виводьте System.println  з якимось тестом.
Після того як опишете , в мейні ви маєте викликати методи крок за кроком там щоб зайти з голоної сторінки на    сторінку
CODE School ->Java Advanced->Навчальний план*/

public class Main {

    public static void main(String[] args) {
        HomePage homePage = new HomePage();
        CodeSchool codeSchool = new CodeSchool("http://lits.ua/lc-school");
        JavaAdvanced javaAdvanced = new JavaAdvanced( "http://lits.ua/lc-school/Java-Professional", "Навчальний план");
        QASchool qaSchool = new QASchool("http://lits.ua/qa-school");

        homePage.openURL();
        homePage.btnLvivItSchool();
        homePage.selectSchool(1);

        codeSchool.openURL();
        codeSchool.btnDetails();

        javaAdvanced.openURL();
        javaAdvanced.btnCurriculum();

    }

}
