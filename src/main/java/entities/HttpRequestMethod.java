package entities;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Олег on 27.04.2016.
 */
public class HttpRequestMethod {
    public enum Method {
        GET, POST, DELETE;
    }
    public HttpRequestMethod(){
    }

    Method method;
    public HttpRequestMethod(Method method){
        this.method = method;
}


    public JSONObject generalJsonRequest(String endpoint, HttpRequestMethod.Method request) throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = null;
        switch(request) {
            case POST:
                HttpPost post = new HttpPost(endpoint);
                response = client.execute(post);
                break;
            case GET:
                HttpGet get = new HttpGet(endpoint);
                response = client.execute(get);
                break;
            case DELETE:
                HttpDelete delete = new HttpDelete(endpoint);
                response = client.execute(delete);
                break;
        }
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        StringBuilder builder = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            builder = builder.append(line);
        }
        JSONObject json = new JSONObject(String.valueOf(builder));
        return json;
    }

    public String generalStringRequest(String endpoint, HttpRequestMethod.Method request) throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = null;
        switch(request) {
            case POST:
                HttpPost post = new HttpPost(endpoint);
                response = client.execute(post);
                break;
            case GET:
                HttpGet get = new HttpGet(endpoint);
                response = client.execute(get);
                break;
            case DELETE:
                HttpDelete delete = new HttpDelete(endpoint);
                response = client.execute(delete);
                break;
        }
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        StringBuilder builder = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            builder = builder.append(line);
        }
        line = String.valueOf(builder);
        return line;
    }

    public String getBasicAuthRequest(String endpoint) throws IOException {
        HttpClient client = HttpClients.createDefault();
        HttpResponse response = null;
        HttpGet get = new HttpGet(endpoint);
        get.setHeader("Authorization: ", "Basic " + "dXNlcjpwYXNzd2Q=");
        response = client.execute(get);
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        StringBuilder builder = new StringBuilder();
        String line = "";
        while ((line = rd.readLine()) != null) {
            builder = builder.append(line);
        }
        line = String.valueOf(builder);
        return line;
    }
}
