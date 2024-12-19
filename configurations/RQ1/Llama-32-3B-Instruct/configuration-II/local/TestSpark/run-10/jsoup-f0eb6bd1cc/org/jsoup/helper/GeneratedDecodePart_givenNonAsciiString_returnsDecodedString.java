package org.jsoup.helper;

public class GeneratedDecodePart_givenNonAsciiString_returnsDecodedString {

    @Test
    public void decodePart_givenNonAsciiString_returnsDecodedString() {
        // Given
        String encoded = "äthling";
        UrlBuilder.urlBuilder = new UrlBuilder();

        // When
        String decoded = UrlBuilder.decodePart(encoded);

        // Then
        assertEquals("äthling", decoded);
    }

}