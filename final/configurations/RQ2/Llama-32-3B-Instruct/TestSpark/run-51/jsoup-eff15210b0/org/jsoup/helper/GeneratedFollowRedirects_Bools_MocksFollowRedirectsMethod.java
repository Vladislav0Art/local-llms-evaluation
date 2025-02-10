package org.jsoup.helper;

public class GeneratedFollowRedirects_Bools_MocksFollowRedirectsMethod {

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
    public void followRedirects_Bools_MocksFollowRedirectsMethod() {
        boolean followRedirects = true;
        HttpConnection.connect(followRedirects);
        Mockito.verify(mockHttpURLConnection).setFollowRedirects(followRedirects);
    }

}