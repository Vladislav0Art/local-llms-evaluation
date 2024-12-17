package org.jsoup.helper;

public class GeneratedAppendToAscii_givenValidString_appendsToStringBuilder {

    @Test
    public void appendToAscii_givenValidString_appendsToStringBuilder() throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        UrlBuilder.appendToAscii("hello world", false, sb);
        assertEquals("hello+world", sb.toString());
    }

}