package org.jsoup.helper;

public class GeneratedTestProxyWithoutMethod {

    public String url;
}

public class TestClass {
    @Before
    public void setup() {
        Request request = new Request();
        HttpConnection connection = new HttpConnection(request, "http://example.com");
        request.setUrl("https://example.net");
        Response response = new Response();
        System.out.println(connection.getProxy());
        System.out.println(connection.getMethod());
    }

    @Test
    public void testProxyWithoutMethod() {
        HttpConnection connection = new HttpConnection(request, null);
        Response response = new Response();
        System.out.println(connection.getProxy());
        System.out.println(response.url);
    }

}