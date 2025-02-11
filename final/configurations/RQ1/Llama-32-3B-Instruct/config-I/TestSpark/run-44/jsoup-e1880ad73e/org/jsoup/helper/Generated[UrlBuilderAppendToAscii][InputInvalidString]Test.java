package org.jsoup.helper;

public class Generated[UrlBuilderAppendToAscii][InputInvalidString]

Test {

    @Test
    public void [UrlBuilderAppendToAscii][InputInvalidString]Test() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        assertSame("", UrlBuilder.appendToAscii("\u00e0mple", false, sb));
    }

}