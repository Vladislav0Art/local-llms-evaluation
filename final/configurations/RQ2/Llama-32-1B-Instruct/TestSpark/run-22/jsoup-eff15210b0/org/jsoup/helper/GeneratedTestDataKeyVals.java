package org.jsoup.helper;

public class GeneratedTestDataKeyVals {

    @Test
    public void testDataKeyVals() throws IOException {
        HttpConnection connection = JsoupHelper.connect("https://example.com", "key1=value1&key2=value2");
        assertEquals(connection.data("key1", "value1"), null);
    }

}