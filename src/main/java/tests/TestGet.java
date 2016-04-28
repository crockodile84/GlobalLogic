package tests;

import entities.HttpRequestMethod;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Олег on 25.04.2016.
 */
public class TestGet extends BaseTest {

   @Test
   public void testGetOriginPositive() throws IOException {
       HttpRequestMethod getRequest = new HttpRequestMethod();
       JSONObject getRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getGet()), HttpRequestMethod.Method.GET);
       Assert.assertEquals("93.73.216.41",getRequestJson.get("origin"));
   }

    @Test
    public void testGetUrlPositive() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject getRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getGet()), HttpRequestMethod.Method.GET);
        Assert.assertEquals("http://httpbin.org/get", getRequestJson.get("url"));
    }

    @Test
    public void testGetOriginNegative() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject getRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getGet()), HttpRequestMethod.Method.GET);
        Assert.assertNotEquals("192.168.100.27",getRequestJson.get("origin"));
    }

    @Test
    public void testGetUrlNegative() throws IOException {
        HttpRequestMethod getRequest = new HttpRequestMethod();
        JSONObject getRequestJson = getRequest.generalJsonRequest(addEndpoint(page.getGet()), HttpRequestMethod.Method.GET);
        Assert.assertNotEquals("httpbin.org/get", getRequestJson.get("url"));
    }

}
