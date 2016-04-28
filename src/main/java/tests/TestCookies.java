package tests;

import entities.HttpRequestMethod;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Олег on 28.04.2016.
 */
public class TestCookies extends BaseTest {

    @Test
    public void testCookiesPositive() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject cookiesRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getCookies()), HttpRequestMethod.Method.GET);
        Assert.assertEquals(cookiesRequestJson.toString(),"{\"cookies\":{}}");
    }

    @Test
    public void testCookiesNegative() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject cookiesRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getCookies()), HttpRequestMethod.Method.GET);
        Assert.assertNotEquals(cookiesRequestJson.toString(),"values");
    }
}
