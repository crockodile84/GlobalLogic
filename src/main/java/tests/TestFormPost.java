package tests;

import entities.HttpRequestMethod;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Олег on 28.04.2016.
 */
public class TestFormPost extends BaseTest {

    private static String formPostResponse = "<!DOCTYPE html>" +
            "<html>" +
            "  <head>" +
            "  </head>" +
            "  <body>" +
            "  <!-- Example form from HTML5 spec http://www.w3.org/TR/html5/forms.html#writing-a-form's-user-interface -->" +
            "  <form method=\"post\" action=\"/post\">" +
            "   <p><label>Customer name: <input name=\"custname\"></label></p>" +
            "   <p><label>Telephone: <input type=tel name=\"custtel\"></label></p>" +
            "   <p><label>E-mail address: <input type=email name=\"custemail\"></label></p>" +
            "   <fieldset>" +
            "    <legend> Pizza Size </legend>" +
            "    <p><label> <input type=radio name=size value=\"small\"> Small </label></p>" +
            "    <p><label> <input type=radio name=size value=\"medium\"> Medium </label></p>" +
            "    <p><label> <input type=radio name=size value=\"large\"> Large </label></p>" +
            "   </fieldset>" +
            "   <fieldset>" +
            "    <legend> Pizza Toppings </legend>" +
            "    <p><label> <input type=checkbox name=\"topping\" value=\"bacon\"> Bacon </label></p>" +
            "    <p><label> <input type=checkbox name=\"topping\" value=\"cheese\"> Extra Cheese </label></p>" +
            "    <p><label> <input type=checkbox name=\"topping\" value=\"onion\"> Onion </label></p>" +
            "    <p><label> <input type=checkbox name=\"topping\" value=\"mushroom\"> Mushroom </label></p>" +
            "   </fieldset>" +
            "   <p><label>Preferred delivery time: <input type=time min=\"11:00\" max=\"21:00\" step=\"900\" name=\"delivery\"></label></p>" +
            "   <p><label>Delivery instructions: <textarea name=\"comments\"></textarea></label></p>" +
            "   <p><button>Submit order</button></p>" +
            "  </form>" +
            "  </body>" +
            "</html>";

    public static String getFormPostResponse() {
        return formPostResponse;
    }

    public static void setFormPostResponse(String formPostResponse) {
        TestFormPost.formPostResponse = formPostResponse;
    }

    @Test
    public void testFormPostPositive() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        String formPostRequestString = getRequest.generalStringRequest(addEndpoint(page.getFormPost()), HttpRequestMethod.Method.GET);
        Assert.assertEquals(formPostRequestString,formPostResponse);
    }

    @Test
    public void testFormPostNegative() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        String formPostRequestString = getRequest.generalStringRequest(addEndpoint(page.getFormPost()), HttpRequestMethod.Method.GET);
        Assert.assertNotEquals(formPostRequestString.toString(),"93.73.216.41");
    }
}
