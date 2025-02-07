package org.jsoup.helper;

public class GeneratedTestGet {

    @Test
    public void testGet() throws IOException {
        HttpURLConnection connection = (HttpURLConnection) HttpConnection.connect("https://example.com");
        Document document = connection.get();
        assertNotSame(document, null);
    }

}