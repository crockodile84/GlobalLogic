package tests;

import entities.HttpRequestMethod;
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
        String getRequestString = getRequest.getBasicAuthRequest(addEndpoint(page.getBasicAuth()));
        Assert.assertEquals(basicAuth, getRequestString);
    }

}
