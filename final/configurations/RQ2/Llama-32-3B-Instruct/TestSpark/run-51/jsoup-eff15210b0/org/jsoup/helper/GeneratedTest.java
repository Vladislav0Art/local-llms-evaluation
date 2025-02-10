package org.jsoup.helper;

public class GeneratedTest {

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
    public void connect_url_MocksConnectMethod() {
        HttpConnection.connect(new URL("https://www.example.com"));
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void connect_URL_MocksConnectMethod() {
        HttpConnection.connect(new URL("https://www.example.com"));
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void newRequest_MocksNewMethod() {
        HttpConnection.newRequest();
        Mockito.verify(mockHttpURLConnection).newMethod();
    }

    @Test
    public void url_URL_MocksUrlMethod() {
        URL url = new URL("https://www.example.com");
        HttpConnection.connect(url);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void url_String_MocksUrlMethod() {
        String url = "https://www.example.com";
        HttpConnection.connect(url);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void proxy_Proxy_MocksProxyMethod() {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("example.com", 8080));
        HttpConnection.connect(proxy);
        Mockito.verify(mockHttpURLConnection).proxy(proxy);
    }

    @Test
    public void proxy_StringInt_MocksProxyMethod() {
        String host = "example.com";
        int port = 8080;
        HttpConnection.connect(host, port);
        Mockito.verify(mockHttpURLConnection).proxy(new InetSocketAddress(host, port));
    }

    @Test
    public void userAgent_String_MocksUserAgentMethod() {
        String userAgent = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.169 Safari/537.3";
        HttpConnection.connect(userAgent);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void timeout_Int_MocksTimeoutMethod() {
        int millis = 5000;
        HttpConnection.connect(millis);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void maxBodySize_Int_MocksMaxBodySizeMethod() {
        int bytes = 1024 * 1024;
        HttpConnection.connect(bytes);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void followRedirects_Bools_MocksFollowRedirectsMethod() {
        boolean followRedirects = true;
        HttpConnection.connect(followRedirects);
        Mockito.verify(mockHttpURLConnection).setFollowRedirects(followRedirects);
    }

    @Test
    public void referrer_String_MocksReferrerMethod() {
        String referrer = "https://www.example.com";
        HttpConnection.connect(referrer);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void method_Method_MocksMethodMethod() {
        Method method = Method.GET;
        HttpConnection.connect(method);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void ignoreHttpErrors_Bools_MocksIgnoreHttpErrorsMethod() {
        boolean ignoreHttpErrors = true;
        HttpConnection.connect(ignoreHttpErrors);
        Mockito.verify(mockHttpURLConnection).connect();
    }

    @Test
    public void ignoreContentType_Bools_MocksIgnoreContentTypeMethod() {
        boolean ignoreContentType = true;
        HttpConnection.connect(ignoreContentType);
        Mockito.verify(mockHttpURLConnection).connect();
    }

}