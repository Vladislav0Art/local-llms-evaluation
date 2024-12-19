package org.jsoup.helper;

public class GeneratedTestAppendKeyVal_Empty {

    @Test
    public void testAppendKeyVal_Empty() {
        UrlBuilder urlBuilder = new UrlBuilder(new URL("http://example.com"));
        urlBuilder.appendKeyVal(null);
        assertEquals("", urlBuilder.build().toString());
    }

}