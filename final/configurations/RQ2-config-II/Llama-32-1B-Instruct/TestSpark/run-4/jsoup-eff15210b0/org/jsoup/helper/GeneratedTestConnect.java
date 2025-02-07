package org.jsoup.helper;

public class GeneratedTestConnect {

    @Test
    public void testConnect() {
        String url = "http://example.com";
        HttpConnection connection = HttpConnection.connect(url);
        assertEquals("http://example.com", connection.get().getURI());
    }

}