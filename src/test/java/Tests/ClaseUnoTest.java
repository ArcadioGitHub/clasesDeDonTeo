package Tests;

import Locators.ClaseUnoPageObjects;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class ClaseUnoTest extends ClaseUnoPageObjects {

    public void clickEnBotonLetMeHack(){
        botonLetMeHack.click();
    }

    public void llenarFormulario(List<Map<String, String>> rows){
        campoNombre.type(rows.get(0).get("NAME"));
        campoEmail.type(rows.get(0).get("EMAIL"));
        campoPhone.type(rows.get(0).get("TELEFONO"));
        campoSubject.type(rows.get(0).get("SUBJECT"));
        campoDescriptiont.type(rows.get(0).get("DESCRIPTION"));
    }

    public void clickEnBotonSubmit(){
        botonEnviar.click();
    }

    public void verificarMensajeDeExito(String mensajeExito){
        Assert.assertEquals(mensajeDeExito.getText(), mensajeExito);
    }
}
