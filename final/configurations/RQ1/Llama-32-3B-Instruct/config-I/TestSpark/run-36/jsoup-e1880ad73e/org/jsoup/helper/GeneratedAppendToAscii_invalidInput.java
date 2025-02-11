package org.jsoup.helper;

public class GeneratedAppendToAscii_invalidInput {

    @Test
    public void appendToAscii_invalidInput() {
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.appendToAscii("", false, new StringBuilder()));
    }

}