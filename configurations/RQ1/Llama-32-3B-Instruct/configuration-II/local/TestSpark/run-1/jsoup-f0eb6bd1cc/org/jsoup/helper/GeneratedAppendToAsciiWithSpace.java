package org.jsoup.helper;

public class GeneratedAppendToAsciiWithSpace {

    @Test
    public void appendToAsciiWithSpace() {
        // Given
        StringBuilder sb = new StringBuilder();
        String s = "é";
        UrlBuilder urlBuilder = new UrlBuilder(connection);

        // When
        urlBuilder.appendToAscii(s, false, sb);

        // Then
        assertEquals("%20", sb.toString());
    }

}