package org.jsoup.helper;

public class GeneratedTest {

    private static final String URL = "https://example.com";
    private static final URL TEST_URL = new URL("http://example.com/test");

    @Before
    public void init() {
    }

    @Test
    public void testConnectMethod() throws IOException {
        HttpConnection connection = HttpConnection.connect(TEST_URL);
        assertEquals(HEAD, connection.getHttpMethod());
    }

    @Test
    public void testNewRequestMethod() throws IOException {
        Request request = new Request();
        HttpConnection connection = HttpConnection.newRequest(request);
        assertNotNull(connection);
        assertEquals(Request.class, connection.getClass());
    }

    @Test
    public void testUrlMethod() throws IOException {
        HttpConnection connection = HttpConnection.connect(URL);
        assertNotNull(connection);
        assertEquals(URL, connection.getUrl());
    }

    @Test
    public void testProxyMethod() throws MalformedURLException, IllegalAccessException {
        String proxyHost = "localhost";
        int proxyPort = 8080;
        Proxy proxy = new com.google.common.util.concurrent.ThreadLocalProxyFactory.create();
        HttpConnection connection = new HttpConnection(proxy);
        assertNotNull(connection.getProxy());
        assertEquals(Proxy.class, connection.getClass().getMethod("getProxy").getClass());
    }

    @Test
    public void testParserMethod() throws UnsupportedMimeTypeException {
        Parser parser = new org.jsoup.parser.Parser();
        HttpConnection connection = new HttpConnection(parser);
        assertNotNull(connection.getParser());
        assertEquals(Parser.class, connection.getClass().getMethod("getParser").getClass());
    }
}

public class RequestTest {
    private static final String MESSAGE = "Hello, world!";

    public static Request newRequest() {
        return new Request(MESSAGE);
    }

    @Test
    public void testMessageProperty() {
        Request request = newRequest();
        assertEquals(MESSAGE, request.getMessage());
    }
}

public class ResponseTest {
    private static final String MESSAGE = "Hello, world!";

    public static ConnectionResponse response() throws IOException {
        // implementation
        return new ConnectionResponse(MESSAGE);
    }

    @Test
    public void testMessageProperty() {
        ConnectionResponse connectionResponse = response();
        assertEquals(MESSAGE, connectionResponse.getMessage());
    }
}

public class CookieStoreTest {
    private static final String COOKIE = "test_cookie";

    public static CookieStore cookieStore() {
        // implementation
        return new CookieStore();
    }

    @Test
    public void testCookieProperty() {
        CookieStore cookieStore = cookieStore();
        assertNotNull(cookieStore);
        assertEquals("test_cookie", cookieStore.getCookie());
    }

}