package Locators;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ClaseUnoPageObjects extends PageObject {
    @FindBy(xpath="//button[text()='Let me hack!']")
    public WebElementFacade botonLetMeHack;

    @FindBy(css="#name")
    public WebElementFacade campoNombre;

    @FindBy(css="#email")
    public WebElementFacade campoEmail;

    @FindBy(css="#phone")
    public WebElementFacade campoPhone;

    @FindBy(css="#subject")
    public WebElementFacade campoSubject;

    @FindBy(css="#description")
    public WebElementFacade campoDescriptiont;

    @FindBy(css="#submitContact")
    public WebElementFacade botonEnviar;

    @FindBy(xpath="//div[@class='row contact']//h2")
    public WebElementFacade mensajeDeExito;
}
