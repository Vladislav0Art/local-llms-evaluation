package org.jsoup.helper;

public class GeneratedTestMaxBodySize {

    @Test
    public void testMaxBodySize() throws IOException {
        HttpConnection connection = JsoupHelper.connect("https://example.com", 1024, "application/octet-stream");
        assertEquals(connection.maxBodySize(1024), 1024);
    }

}