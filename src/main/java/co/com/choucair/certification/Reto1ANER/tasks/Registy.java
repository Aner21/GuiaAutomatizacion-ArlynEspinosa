package co.com.choucair.certification.Reto1ANER.tasks;

import co.com.choucair.certification.Reto1ANER.interactions.OptionList;
import co.com.choucair.certification.Reto1ANER.interactions.SelectList;
import co.com.choucair.certification.Reto1ANER.model.DataForm;
import co.com.choucair.certification.Reto1ANER.usertinterface.AutomationWebFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class Registy implements Task {
    private List<DataForm> dataForm;
    public Registy(List<DataForm> dataForm) {
        this.dataForm = dataForm;
    }


    public static Registy the(List<DataForm> dataForm) {
        return Tasks.instrumented(Registy.class, dataForm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        /*actor.attemptsTo(Enter.theValue("CARLOS").into(AutomationWebFormulario.FIRST_NAME),
                /*Enter.theValue("RIOS").into(AutomationWebFormulario.LAST_NAME),
                Enter.theValue("PANAMA, PANAMA").into(AutomationWebFormulario.ADDRESS),
                Enter.theValue("carlos.rios@micorreo.com").into(AutomationWebFormulario.EMAIL),
                Enter.theValue("0315551234").into(AutomationWebFormulario.PHONE)*/
        actor.attemptsTo(Enter.theValue(dataForm.get(0).getFirstname()).into(AutomationWebFormulario.FIRST_NAME),
                Enter.theValue(dataForm.get(0).getLastname()).into(AutomationWebFormulario.LAST_NAME),
                Enter.theValue(dataForm.get(0).getAddress()).into(AutomationWebFormulario.ADDRESS),
                Enter.theValue(dataForm.get(0).getEmail()).into(AutomationWebFormulario.EMAIL),
                Enter.theValue(dataForm.get(0).getPhone()).into(AutomationWebFormulario.PHONE),
                Click.on(AutomationWebFormulario.SELECT_GENDER_MALE),

                Click.on(AutomationWebFormulario.SELECT_HOBBIES),

               Click.on(AutomationWebFormulario.LANGUAGE),

               SelectList.Lista(AutomationWebFormulario.LIST_LANGUAGES,dataForm.get(0).getLanguages()),
                Click.on(AutomationWebFormulario.LANGUAGE),

                OptionList.Lista(AutomationWebFormulario.LIST_SKILLS,dataForm.get(0).getSkills()),
                OptionList.Lista(AutomationWebFormulario.LIST_COUNTRY, dataForm.get(0).getCountry()),
                OptionList.Lista(AutomationWebFormulario.LIST_SELECTCOUNTRY, dataForm.get(0).getSelect_country()),
                OptionList.Lista(AutomationWebFormulario.LIST_YEAR,dataForm.get(0).getYear()),
                OptionList.Lista(AutomationWebFormulario.LIST_MONTH, dataForm.get(0).getMonth()),
                OptionList.Lista(AutomationWebFormulario.LIST_DAY, dataForm.get(0).getDay()),


                Enter.theValue(dataForm.get(0).getPassword1()).into(AutomationWebFormulario.PASSWORD1),
                Enter.theValue(dataForm.get(0).getPassword2()).into(AutomationWebFormulario.PASSWORD2),

                Click.on(AutomationWebFormulario.BUTTON_SUBMIT)




                );


    }
}
