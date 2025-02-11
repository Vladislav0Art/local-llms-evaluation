package org.jsoup.helper;

public class GeneratedDecodePart_invalidEncoding {

    @Test
    public void decodePart_invalidEncoding() {
        assertThrows(UnsupportedEncodingException.class, () -> UrlBuilder.decodePart(""));
    }

}