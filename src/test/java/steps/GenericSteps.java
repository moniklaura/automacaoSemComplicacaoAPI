package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.restassured.http.ContentType;
import maps.LoginMap;
import org.junit.Assert;
import utils.RestUtils;

public class GenericSteps {
    @Entao("valido que recebo o status {int} no response")
    public void validoQueReceboOStatusNoResponse(int status) {
        Assert.assertEquals(status, RestUtils.getResponse().getStatusCode());
    }
    @Entao("armazeno o token que recebo do response de Login")
    public void armazenoOTokenQueReceboDoResponseDeLogin() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entao("valido que no  campo {string} possui o valor {string}")
    public void validoQueNoCampoPossuiOValor(String Key, String value) {
        RestUtils.getResponse().jsonPath().get(Key);
        Assert.assertEquals(value, RestUtils.getResponse().jsonPath().get(Key));
    }


}
