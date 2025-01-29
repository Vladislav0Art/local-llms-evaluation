package org.jsoup.helper;

public class GeneratedTestTimeout {

    @Test
    public void testTimeout() throws IOException {
        HttpConnection connection = JsoupHelper.connect("https://example.com", 100);
        assertEquals(connection.timeout(100), true);
    }

}