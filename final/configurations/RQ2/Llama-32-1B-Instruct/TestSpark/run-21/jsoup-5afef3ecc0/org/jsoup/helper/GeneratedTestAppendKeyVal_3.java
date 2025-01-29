package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_3 {

    @Test
    public void testAppendKeyVal_3() {
        String inputUrl = "http://example.com/path?param=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal("key", "value");
        assertEquals("http://example.com/path?key=value", urlBuilder.build().toString());
    }

}