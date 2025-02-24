package org.jsoup.helper;

public class GeneratedTestConnect {

    private static final String URL_STRING = "https://www.example.com";
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.114 Safari/537.36";
    private static final String REFERRER = "https://www.google.com";
    private static final String SSL_SOCKET_FACTORY_CLASS_NAME = "org.jsoup.helper.HttpConnectionTest$MockSSLSocketFactory";
    private static final String DATA_KEY = "key";
    private static final String DATA_VALUE = "value";
    private static final String HEADER_NAME = "header";
    private static final String HEADER_VALUE = "value";
    private static final String COOKIE_NAME = "cookie";
    private static final String COOKIE_VALUE = "value";

    private HttpConnection httpConnection;

    @Before
    public void setup() {
        httpConnection = new HttpConnection();
    }

    @Test
    public void testConnect() {
        assertNotNull(HttpConnection.connect(URL_STRING));
        assertNotNull(HttpConnection.connect(new URL(URL_STRING)));
    }

}