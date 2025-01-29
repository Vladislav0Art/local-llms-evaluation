package org.jsoup.helper;

public class GeneratedTestCookies {

    @Test
    public void testCookies() throws IOException {
        HttpConnection connection = JsoupHelper.connect("https://example.com", "key1=value1&key2=value2");
        assertEquals(connection.cookies(Collections.singletonMap("key1", "value1")), Collections.emptyMap());
    }

}