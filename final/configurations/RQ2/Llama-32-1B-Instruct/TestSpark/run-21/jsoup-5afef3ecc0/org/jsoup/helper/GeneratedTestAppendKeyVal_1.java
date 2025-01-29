package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_1 {

    @Test
    public void testAppendKeyVal_1() {
        String inputUrl = "http://example.com/path?param=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal("key", "value");
        assertEquals("http://example.com/path?key=value", urlBuilder.build().toString());
    }

}