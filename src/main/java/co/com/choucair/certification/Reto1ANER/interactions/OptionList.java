package co.com.choucair.certification.Reto1ANER.interactions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OptionList implements Interaction {
    private Target list;
    private String option;

    public OptionList(Target list, String option) {
        this.list = list;
        this.option = option;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        List<WebElement> listObjeto = list.resolveFor(actor).findElements(By.tagName("option"));
        for(int i=0; i < listObjeto.size(); i++){
            if (listObjeto.get(i).getText().equals(option)){
                listObjeto.get(i).click();
                break;
            }
        }

    }

    public static OptionList Lista(Target list, String option){
        return new OptionList(list, option);
    }
}
