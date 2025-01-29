package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_4 {

    @Test
    public void testAppendKeyVal_4() {
        String inputUrl = "http://example.com/path?param=value";
        UrlBuilder urlBuilder = new UrlBuilder(new URL(inputUrl));
        urlBuilder.appendKeyVal("key", "value");
        assertEquals("", urlBuilder.build().toString());
    }

}