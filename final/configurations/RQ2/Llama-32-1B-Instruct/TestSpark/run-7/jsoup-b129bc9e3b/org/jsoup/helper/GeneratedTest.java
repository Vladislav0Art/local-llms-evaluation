package org.jsoup.helper;

public class GeneratedTest {

    @Test
    public void testConnect() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        assertNotNull(connection);
    }

    @Test
    public void testConnectWithProxy() {
        HttpConnection connection = HttpConnection.connect("http://proxy.example.com", new Proxy("http://localhost:8080", null));
        assertNotNull(connection);
    }

    @Test
    public void testConnectWithCookies() {
        HttpConnection connection = HttpConnection.connect("http://example.com?cookie=foo");
        assertEquals(8, connection.getCookieManager().getCookieCount());
    }

    @Test
    public void testFollowRedirects() {
        HttpConnection connection = HttpConnection.connect("http://example.com", true);
        assertNotNull(connection);
        assertEquals(true, connection.followRedirects());
    }

    @Test
    public void testIgnoreHttpErrors() {
        HttpConnection connection = HttpConnection.connect("http://example.com");
        assertFalse(connection.ignoreHttpErrors(false));
    }

    @Test
    public void testIgnoreContentType() {
        HttpConnection connection = HttpConnection.connect("http://example.com?content-type=application/json");
        assertEquals(8, connection.getCookieManager().getCookieCount());
    }

    @Test
    public void testData() {
        HttpConnection connection = new HttpConnection();
        Connection.Response response = connection.response(null);
        assertNotNull(response);
    }

    @Test
    public void testDataWithCookies() {
        HttpConnection connection = new HttpConnection();
        Collection<Connection.KeyVal> data = new ArrayList<>();
        data.add(new Connection.KeyVal("key1", "value1"));
        connection.data(data);
        assertEquals(3, connection.getCookieManager().getCookieCount());
    }

    @Test
    public void testRequestBody() {
        HttpConnection connection = new HttpConnection();
        String body = "{\"key\":\"value\"}";
        connection.request(new Request(Request.Method.POST, URL.create("http://example.com"), null, body));
        assertEquals(200, connection.getResponseCode());
    }

}