package org.jsoup.helper;

public class GeneratedDecodePart_WithUnsupportedEncoding {

    @Test
    public void decodePart_WithUnsupportedEncoding() {
        // Given
        String encoded = "áthás";

        // When
        URLDecoder.decode(encoded, "Invalid Encoding");
    }

}