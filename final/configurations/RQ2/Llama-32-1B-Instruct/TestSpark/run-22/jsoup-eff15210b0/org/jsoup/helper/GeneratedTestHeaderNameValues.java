package org.jsoup.helper;

public class GeneratedTestHeaderNameValues {

    @Test
    public void testHeaderNameValues() throws IOException {
        HttpConnection connection = JsoupHelper.connect("https://example.com", "key1=value1&key2=value2");
        assertEquals(connection.header("key1", "value1"), null);
    }

}