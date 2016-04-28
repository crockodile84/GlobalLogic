package tests;

import entities.HttpRequestMethod;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Олег on 28.04.2016.
 */
public class TestCookiesDelete extends BaseTest {

    @Test
    public void testCookiesDeletePositive() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject cookiesDeleteRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getCookiesDelete()), HttpRequestMethod.Method.GET);
        Assert.assertEquals(cookiesDeleteRequestJson.toString(),"{\"cookies\":{}}");
    }

    @Test
    public void testCookiesDeleteNegative() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject cookiesDeleteRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getCookiesDelete()), HttpRequestMethod.Method.GET);
        Assert.assertNotEquals(cookiesDeleteRequestJson.toString(),"value");
    }
}
