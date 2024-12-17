package org.jsoup.helper;

public class GeneratedDecodePart_givenValidEncodedString_returnsDecodedString {

    @Test
    public void decodePart_givenValidEncodedString_returnsDecodedString() throws UnsupportedEncodingException {
        String encoded = "%c0%af";
        assertEquals("\u00ae", UrlBuilder.decodePart(encoded));
    }

}