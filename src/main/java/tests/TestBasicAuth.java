package tests;

import entities.HttpRequestMethod;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Олег on 28.04.2016.
 */
public class TestBasicAuth extends BaseTest{
    String basicAuth = "{" +
            "  \"authenticated\": true, " +
            "  \"user\": \"user\"" +
            "}";

    @Test
    public void testBasicAuthPositive() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject getRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getBasicAuth()), HttpRequestMethod.Method.GET);
        Assert.assertEquals(getRequestJson.toString(),basicAuth);
    }

}
