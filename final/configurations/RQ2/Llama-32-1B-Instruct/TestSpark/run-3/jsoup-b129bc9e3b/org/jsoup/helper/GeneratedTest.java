package org.jsoup.helper;

public class GeneratedTest {

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
    public void testProxy() {
        HttpConnection connection = new HttpConnection(request, null);
        System.out.println(connection.getProxy());
        System.out.println(connection.getMethod());
    }

    @Test
    public void testNoMethod() {
        HttpConnection connection = new HttpConnection(request, null);
        Response response = new Response();
        System.out.println(connection.getProxy());
        System.out.println(response.url);
    }
}

public class TestClass2 {
    @Before
    public void setup() {
        Request request = new Request();
        HttpConnection connection = new HttpConnection(request, "http://example.com");
        request.setUrl("https://example.net");
    }

    @Test
    public void testProxyWithoutMethod() {
        HttpConnection connection = new HttpConnection(request, null);
        Response response = new Response();
        System.out.println(connection.getProxy());
        System.out.println(response.url);
    }

}