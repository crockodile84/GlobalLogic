package tests;

import entities.HttpRequestMethod;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Олег on 28.04.2016.
 */
public class TestCookiesSet extends BaseTest{
    private static String cookiesSet = "{" +
            "\"cookies\":{" +
            "\"name\":\"value\"" +
            "}" +
            "}";

    public static String getCookiesSet() {
        return cookiesSet;
    }

    public static void setCookiesSet(String cookiesSet) {
        TestCookiesSet.cookiesSet = cookiesSet;
    }

    @Test
    public void testCookiesSetPositive() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject cookiesSetRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getCookiesSet()), HttpRequestMethod.Method.GET);
        System.out.println(cookiesSetRequestJson);
        Assert.assertEquals(cookiesSetRequestJson.toString(),cookiesSet);
    }

    @Test
    public void testCookiesSetNegative() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject cookiesSetRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getCookiesSet()), HttpRequestMethod.Method.GET);
        Assert.assertNotEquals(cookiesSetRequestJson.toString(),"name\":\"value");
    }
}
