package org.jsoup.helper;

public class GeneratedTest {

    private String proxy;

    public static Connection proxy(String proxy) {
        Connection conn = new Connection();
        conn.proxy = proxy;
        return conn;
    }

    public String getProxy() {
        return proxy;
    }
}

public class Method {
    public static Method GET() {
        Method method = new Method();
        method.name = "GET";
        return method;
    }

    private String name;

    public String getName() {
        return name;
    }
}

public class Request {
    public Connection connection;
    public String url;
    public Method method;

    public Request(Connection connection, String url, Method method) {
        this.connection = connection;
        this.url = url;
        this.method = method;
    }

    public void execute() {
        System.out.println("Sending " + method.getName() + request to URL:" + url);
    }
}

public class TestConnection {

    @Test
    public void testGetRequest() {
        Connection proxy = Connection.proxy("http://example.com");
        Request request = new Request(proxy, "https://www.example.com", Method.GET());
        request.execute();
    }

    @Test
    public void testPostRequest() {
        Connection proxy = Connection.proxy("http://example.com");
        Request request = new Request(proxy, "https://www.example.com", Method.POST());
        request.execute();
    }

}