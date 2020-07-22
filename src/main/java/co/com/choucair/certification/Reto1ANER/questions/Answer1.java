package co.com.choucair.certification.Reto1ANER.questions;

import co.com.choucair.certification.Reto1ANER.usertinterface.AutomationWebFormulario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer1 implements Question<Boolean> {
   private String question;

    public Answer1(String question) {
        this.question=question;
    }

    public static Answer1 toThe(String question) {
        return new Answer1(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String name_text= Text.of(AutomationWebFormulario.NAME_REFERENCE).viewedBy(actor).asString();

        if (question.equals(name_text)){
            result=true;
        }else {
            result=false;
        }

        return result;
    }
}
