package org.jsoup.helper;

public class GeneratedProxy_Proxy_MocksProxyMethod {

    public static void connect(URL url) {
        // implementation
    }

    public static void connect(String url) {
        // implementation
    }

    public static void newRequest() {
        // implementation
    }
}

public class HttpURLConnectionMock implements HttpURLConnection {
    @Override
    public void setFollowRedirects(boolean followRedirects) {
        // implementation
    }

    @Override
    public String getURL() {
        return "https://www.example.com";
    }

    @Override
    public int getConnectTimeout() {
        return 5000;
    }
}

public class HttpConnectionTest {

    private HttpURLConnectionMock mockHttpURLConnection;

    @Before
    public void setup() {
        this.mockHttpURLConnection = new HttpURLConnectionMock();
    }

    @Test
    public void proxy_Proxy_MocksProxyMethod() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080));
        HttpConnection.connect(proxy);
        Mockito.verify(mockHttpURLConnection).proxy(proxy);
    }

}