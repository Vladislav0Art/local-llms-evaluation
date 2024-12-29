package org.jsoup.helper;

public class GeneratedTestCookieStore {

    @Test
    public void testCookieStore() throws MalformedURLException {
        MockHttpConnection connection = new MockHttpConnection();
        URL url = new URL("https://example.com?cookieStore=mock");
        assertEquals("https://example.com", connection.cookieStore().get());
    }
}

class MockHttpConnection implements HttpConnection {
    private HttpURLConnection connection;

    public String connect(String url) throws MalformedURLException, IOException {
        connection = (HttpURLConnection) new URL(url).openConnection();
        return "https://" + connection.getHost() + ":" + connection.getPort() + url;
    }

    @Override
    public Connection newRequest() {
        return this;
    }

    @Override
    public Connection url(URL url) throws MalformedURLException, IOException {
        return connect(url);
    }

    @Override
    public Connection url(String url) throws MalformedURLException, IOException {
        return connect(new URL(url));
    }

}