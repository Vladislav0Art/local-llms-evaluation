package org.jsoup.helper;

public class GeneratedAppendToAscii_givenNonAsciiStringReturnsNormalizedString {

    @Test
    public void appendToAscii_givenNonAsciiStringReturnsNormalizedString() {
        // Given
        UrlBuilder.urlBuilder = new UrlBuilder();
        StringBuilder sb = new StringBuilder();

        // When
        appendToAscii("äthling", false, sb);

        // Then
        assertEquals("%C3%A4thling", sb.toString());
    }

}