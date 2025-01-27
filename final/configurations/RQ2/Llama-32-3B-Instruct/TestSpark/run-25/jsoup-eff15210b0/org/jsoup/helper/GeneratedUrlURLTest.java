package org.jsoup.helper;

public class GeneratedUrlURLTest {

    @Test
    public void urlURLTest() throws MalformedURLException {
        URL url = new URL("https://example.com");
        Connection connection = HttpConnection.connect(url);
        Connection url2 = connection.url(url);
        assertEquals(1, url.hashCode());
    }

}