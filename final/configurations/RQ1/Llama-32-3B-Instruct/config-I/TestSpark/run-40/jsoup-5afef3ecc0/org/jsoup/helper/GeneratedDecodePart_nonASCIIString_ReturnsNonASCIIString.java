package org.jsoup.helper;

public class GeneratedDecodePart_nonASCIIString_ReturnsNonASCIIString {

    @Test
    public void decodePart_nonASCIIString_ReturnsNonASCIIString() throws UnsupportedEncodingException {
        assertEquals("ä", UrlBuilder.decodePart("ä"));
    }

}