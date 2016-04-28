package entities;

/**
 * Created by Олег on 25.04.2016.
 */
public class Page {

    private String host ="http://httpbin.org";
    private String get = "/get";
    private String cookies = "/cookies";
    private String cookiesSet = "/cookies/set?name=value";
    private String cookiesDelete = "/cookies/delete?name";
    private String html = "/html";
    private String formPost = "/forms/post";
    private String basicAuth = "/basic-auth/:user/:passwd";

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getGet() {
        return get;
    }

    public void setGet(String get) {
        this.get = get;
    }

    public String getCookies() {
        return cookies;
    }

    public void setCookies(String cookies) {
        this.cookies = cookies;
    }

    public String getCookiesSet() {
        return cookiesSet;
    }

    public void setCookiesSet(String cookiesSet) {
        this.cookiesSet = cookiesSet;
    }

    public String getCookiesDelete() {
        return cookiesDelete;
    }

    public void setCookiesDelete(String cookiesDelete) {
        this.cookiesDelete = cookiesDelete;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getFormPost() {
        return formPost;
    }

    public void setFormPost(String formPost) {
        this.formPost = formPost;
    }

    public String getBasicAuth() {
        return basicAuth;
    }

    public void setBasicAuth(String basicAuth) {
        this.basicAuth = basicAuth;
    }
}
