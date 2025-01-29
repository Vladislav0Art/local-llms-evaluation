package org.jsoup.helper;

public class GeneratedTestCookieNameValues {

    @Test
    public void testCookieNameValues() throws IOException {
        HttpConnection connection = JsoupHelper.connect("https://example.com", "key1=value1&key2=value2");
        assertEquals(connection.cookie("key1", "value1"), null);
    }

}