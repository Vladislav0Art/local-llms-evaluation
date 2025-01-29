package org.jsoup.helper;

public class GeneratedTestConnect_withProxy {

    private Request request;
    private String url;

    @Before
    public void setup() {
        request = new Request();
        url = "https://example.com";
    }

    public Connection connect(String url) {
        return new HttpConnection(request, url);
    }

    public Connection connect(URL url) {
        return new HttpConnection(new Request(), url);
    }

    public HttpConnection.Request newRequest() {
        request = new Request();
        return request;
    }

    @Test
    public void testConnect_withProxy() throws IOException {
        HttpConnection connection = new HttpConnection(connect("https://example.com"));
        System.out.println(connection.proxy());
    }

    public Connection url(String url) {
        return connect(url);
    }

    public Connection url(URL url) {
        return new HttpConnection(new Request(), url);
    }

}