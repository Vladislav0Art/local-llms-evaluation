package org.jsoup.helper;

public class GeneratedAppendToAscii_givenStringWithSpace_returnsNormalizedString {

    @Test
    public void appendToAscii_givenStringWithSpace_returnsNormalizedString() {
        // Given
        UrlBuilder.urlBuilder = new UrlBuilder();
        StringBuilder sb = new StringBuilder();

        // When
        appendToAscii(" ä ", true, sb);

        // Then
        assertEquals("%20", sb.toString());
    }

}