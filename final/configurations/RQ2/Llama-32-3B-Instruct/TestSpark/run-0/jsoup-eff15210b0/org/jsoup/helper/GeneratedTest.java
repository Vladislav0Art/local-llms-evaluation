package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void connectUrlTest() throws MalformedURLException {
        assertSame(HttpConnection.connect("https://example.com"), HttpConnection.connect(new URL("https://example.com")));
    }

    @Test
    public void newRequestTest() {
        Connection newReq = HttpConnection.newRequest();
        assertNotNull(newReq);
        assertFalse(newReq.isComplete());
    }

    @Test
    public void urlStringTest() throws MalformedURLException {
        assertSame(HttpConnection.url("https://example.com"), HttpConnection.connect("https://example.com"));
        assertEquals(null, HttpConnection.url(null));
    }

    @Test
    public void urlUrlTest() {
        URL url = new URL("https://example.com");
        assertSame(url, HttpConnection.url(url));
    }

    @Test
    public void proxyTest() {
        Connection conn = HttpConnection.connect("https://example.com").proxy(new Proxy(Proxy.Type.HTTP, 8080));
        assertNotNull(conn);
        assertTrue(conn.isProxy());
    }

    @Test
    public void proxyStringIntTest() throws IOException {
        assertSame(HttpConnection.proxy("example.com", 8080), HttpConnection.connect("https://example.com").proxy("example.com", 8080));
    }

    @Test
    public void userAgentNullTest() {
        assertSame(HttpConnection.userAgent(null), null);
    }

    @Test
    public void userAgentStringTest() {
        assertSame(HttpConnection.userAgent("test"), "test");
    }

    @Test
    public void timeoutTest() throws IOException {
        assertSame(HttpConnection.timeout(1000), HttpConnection.connect("https://example.com").timeout(1000));
    }

    @Test
    public void timeoutNegativeTest() throws IOException {
        assertSame(HttpConnection.timeout(-1), -1);
    }

    @Test
    public void maxBodySizeTest() throws IOException {
        assertSame(HttpConnection.maxBodySize(-1), -1);
    }

    @Test
    public void followRedirectsTrueTest() throws IOException {
        assertSame(HttpConnection.followRedirects(true), true);
    }

    @Test
    public void followRedirectsFalseTest() throws IOException {
        assertSame(HttpConnection.followRedirects(false), false);
    }

    @Test
    public void referrerNullTest() {
        assertSame(HttpConnection.referrer(null), null);
    }

    @Test
    public void referrerStringTest() {
        assertSame("test", HttpConnection.referrer("test"));
    }

    @Test
    public void methodHeadTest() throws IOException {
        assertSame(HttpConnection.method(HEAD), HEAD);
    }

    @Test
    public void ignoreHttpErrorsFalseTest() throws IOException {
        assertSame(HttpConnection.ignoreHttpErrors(false), false);
    }

    @Test
    public void ignoreHttpErrorsTrueTest() throws IOException {
        assertSame(HttpConnection.ignoreHttpErrors(true), true);
    }

    @Test
    public void ignoreContentTypeFalseTest() throws IOException {
        assertSame(HttpConnection.ignoreContentType(false), false);
    }

    @Test
    public void ignoreContentTypeTrueTest() throws IOException {
        assertSame(HttpConnection.ignoreContentType(true), true);
    }

    @Test
    public void dataNullStringTest() {
        assertEquals(null, HttpConnection.data(null, null));
    }

    @Test
    public void dataNullUrlTest() {
        assertEquals(null, HttpConnection.data(null, new URL("https://example.com")));
    }

    @Test
    public void sslSocketFactoryNullTest() {
        assertSame(HttpConnection.sslSocketFactory(null), null);
    }

    @Test
    public void postDataCharsetStringTest() throws IOException {
        assertSame("test", HttpConnection.postDataCharset("test"));
    }

}