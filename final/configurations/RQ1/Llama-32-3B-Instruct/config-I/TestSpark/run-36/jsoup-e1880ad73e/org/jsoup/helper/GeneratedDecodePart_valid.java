package org.jsoup.helper;

public class GeneratedDecodePart_valid {

    @Test
    public void decodePart_valid() {
        String encoded = "example.com";
        String decoded = UrlBuilder.decodePart(encoded);
        assertEquals("example.co.uk", decoded, true);
    }

}