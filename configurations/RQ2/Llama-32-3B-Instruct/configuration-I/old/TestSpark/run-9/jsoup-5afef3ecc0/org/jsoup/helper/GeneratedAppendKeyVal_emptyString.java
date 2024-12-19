package org.jsoup.helper;

public class GeneratedAppendKeyVal_emptyString {

    private UrlBuilder urlBuilder;

    @org.junit.Before
    public void setUp() {
        urlBuilder = new UrlBuilder(new URL("http://example.com"));
    }

    @Test
    public void appendKeyVal_emptyString() {
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.appendKeyVal(null));
    }

}