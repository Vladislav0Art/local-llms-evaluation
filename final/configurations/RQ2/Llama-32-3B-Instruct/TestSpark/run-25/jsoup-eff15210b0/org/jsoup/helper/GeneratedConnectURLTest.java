package org.jsoup.helper;

public class GeneratedConnectURLTest {

    @Test
    public void connectURLTest() throws MalformedURLException {
        URL url = new URL("https://example.com");
        Connection connection = HttpConnection.connect(url);
        assertNotNull(connection);
    }

}