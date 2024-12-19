package org.jsoup.helper;

public class GeneratedUrlBuilder_decodePart_nonEmptyString {

    @Test
    public void urlBuilder_decodePart_nonEmptyString() {
        assertEquals("example", UrlBuilder.decodePart("http%3A%2F%2Fexample.com"));
    }

}