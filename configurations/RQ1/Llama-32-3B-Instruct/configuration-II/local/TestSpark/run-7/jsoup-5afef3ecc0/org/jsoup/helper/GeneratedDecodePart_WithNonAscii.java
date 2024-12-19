package org.jsoup.helper;

public class GeneratedDecodePart_WithNonAscii {

    @Test
    public void decodePart_WithNonAscii() {
        // Given
        String encoded = "áthás";
        String expected = "áthás";

        // When
        String decoded = UrlBuilder.decodePart(encoded);

        // Then
        assertEquals(expected, decoded);
    }

}