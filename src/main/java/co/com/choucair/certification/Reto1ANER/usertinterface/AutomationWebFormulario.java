package co.com.choucair.certification.Reto1ANER.usertinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AutomationWebFormulario extends PageObject {

    public static final Target FIRST_NAME= Target.the("Input First Name").located(By.xpath("//*[@id=\'basicBootstrapForm\']/div[1]/div[1]/input"));
    public static final Target LAST_NAME= Target.the("Input Last Name").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
    public static final Target ADDRESS= Target.the("Input Address").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
    public static final Target EMAIL= Target.the("Input email").located(By.xpath("//*[@id=\"eid\"]/input"));
    public static final Target PHONE= Target.the("Input phone").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input"));
    public static final Target SELECT_GENDER_MALE= Target.the("Select gender: Male").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
    public static final Target SELECT_HOBBIES= Target.the("Select Hobbies: Movies").located(By.id("checkbox2"));
    public static final Target LANGUAGE= Target.the("Input Languages").located(By.id("msdd"));
    public static final Target LIST_LANGUAGES = Target.the("Select List Language").located(By.xpath("//*[@id='basicBootstrapForm']/div[7]/div/multi-select/div[2]/ul"));
    public static final Target LIST_SKILLS = Target.the("Select List Skills").located(By.id("Skills"));
    public static final Target LIST_COUNTRY = Target.the("Select List Country").located(By.id("countries"));
    public static final Target LIST_SELECTCOUNTRY = Target.the("Select List Select Country").located(By.xpath("//*[@id='basicBootstrapForm']/div[10]/div"));
    public static final Target LIST_YEAR = Target.the("Select YEAR").located(By.id("yearbox"));
    public static final Target LIST_MONTH = Target.the("Select MONTH").located(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
    public static final Target LIST_DAY = Target.the("Select DAY").located(By.id("daybox"));
    public static final Target PASSWORD1= Target.the("Input Password1").located(By.id("firstpassword"));
    public static final Target PASSWORD2= Target.the("Input Password2").located(By.id("secondpassword"));
    public static final Target BUTTON_SUBMIT= Target.the("Click Button Submit").located(By.id("submitbtn"));

    public static final Target NAME_REFERENCE = Target.the("Double Click on Edit Icon to EDIT the Table Row").located(By.xpath("/html/body/section/div[1]/div/div[2]/h4[1]"));



}
