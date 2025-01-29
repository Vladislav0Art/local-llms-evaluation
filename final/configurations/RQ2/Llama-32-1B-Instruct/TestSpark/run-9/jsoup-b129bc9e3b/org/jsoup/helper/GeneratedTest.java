package org.jsoup.helper;

public class GeneratedTest {

    private static HttpConnection httpConnection;

    @BeforeClass
    public static void setUp() {
        String url = "http://example.com";
        httpConnection = HttpConnection.connect(url);
    }

    @Test
    public void testConnectMethod() throws IOException {
        Connection connection = new Connection();
        Assert.assertTrue(connection == httpConnection);
    }

    @Test
    public void testConnectMethodWithProxy() throws IOException {
        String proxyUrl = "http://proxy.example.com";
        httpConnection = HttpConnection.connect(proxyUrl);
        Assert.assertTrue(httpConnection == httpConnection);
    }

    @Test
    public void testUrl() throws IOException {
        Document document = new Document();
        Assert.assertEquals("https://example.com", httpConnection.url(document));
    }

    @Test
    public void testProxy() throws IOException {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnlocalHost("localhost"));
        httpConnection = HttpConnection.connect(proxy);
        Assert.assertTrue(httpConnection == httpConnection);
    }

    @Test
    public void testUagent() throws IOException {
        String userAgent = "Example User Agent";
        httpConnection = HttpConnection.connect(new Request(null));
        Assert.assertEquals(userAgent, (String) httpConnection.userAgent());
    }

    @Test
    public void testTimeout() throws IOException {
        int timeoutMs = 1000;
        httpConnection = HttpConnection.connect("https://example.com", 1000);
        Assert.assertTrue(httpConnection.timeout(timeoutMs));
    }

    @Test
    public void testMaxBodySize() throws IOException {
        int maxBytes = 1024 * 10;
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertEquals(2048, (int) httpConnection.maxBodySize(maxBytes));
    }

    @Test
    public void testFollowRedirects() throws IOException {
        boolean followRedirects = true;
        httpConnection = HttpConnection.connect("https://example.com", followRedirects);
        Assert.assertTrue(httpConnection.followRedirects(followRedirects));
    }

    @Test
    public void testReferrer() throws IOException {
        String referrer = "http://other.example.com";
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertEquals(referrer, (String) httpConnection.referrer());
    }

    @Test
    public void testMethod() throws IOException {
        Method method = Method.HEAD;
        httpConnection = HttpConnection.connect("https://example.com", method);
        Assert.assertTrue(httpConnection.method(method));
    }

    @Test
    public void testIgnoreHttpErrors() throws IOException {
        boolean ignoreHttpErrors = true;
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertFalse(httpConnection.ignoreHttpErrors(ignoreHttpErrors));
    }

    @Test
    public void testIgnoreContentType() throws IOException {
        boolean ignoreContentType = false;
        httpConnection = HttpConnection.connect("https://example.com", ignoreContentType);
        Assert.assertFalse(httpConnection.ignoreContentType(ignoreContentType));
    }

    @Test
    public void testData() throws IOException {
        String key = "testKey";
        String value = "testValue";
        httpConnection = HttpConnection.connect(key, value);
        Assert.assertEquals(value, (String) httpConnection.data(key));
    }

    @Test
    public void testSslSocketFactory() throws IOException {
        SSLSocketFactory sslSocketFactory = new SSLSocketFactory();
        httpConnection = HttpConnection.connect("https://example.com", sslSocketFactory);
        Assert.assertEquals(SSLContext.getDefault(), (javax.net.ssl.SSLContext) httpConnection.sslSocketFactory());
    }

    @Test
    public void testDataWithInputStream() throws IOException {
        InputStream inputStream = new ByteArrayInputStream(new byte[]{1, 2, 3, 4});
        String key = "testKey";
        String value = "testValue";
        httpConnection = HttpConnection.connect(key, value);
        Assert.assertEquals(value, (String) httpConnection.data(key, null, inputStream));
    }

    @Test
    public void testDataWithOutputStream() throws IOException {
        OutputStream outputStream = new ByteArrayOutputStream();
        InputStream inputStream = new ByteArrayInputStream(new byte[]{1, 2, 3, 4});
        String key = "testKey";
        String value = "testValue";
        httpConnection = HttpConnection.connect(key, value);
        Assert.assertEquals(value, (String) httpConnection.data(key, null, outputStream));
    }

    @Test
    public void testDataWithCookieStore() throws IOException {
        CookieStore cookieStore = new CookieManager();
        httpConnection = HttpConnection.connect("https://example.com");
        Assert.assertTrue(httpConnection.cookieStore(cookieStore));
    }

    @Test
    public void testParser() throws IOException {
        Parser parser = new Parser();
        httpConnection = HttpConnection.connect("https://example.com", parser);
        Assert.assertEquals(parser, (Parser) httpConnection.parser());
    }

}