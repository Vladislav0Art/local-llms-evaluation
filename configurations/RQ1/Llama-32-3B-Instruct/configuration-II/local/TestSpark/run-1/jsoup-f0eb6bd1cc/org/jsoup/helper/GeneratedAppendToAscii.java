package org.jsoup.helper;

public class GeneratedAppendToAscii {

    @Test
    public void appendToAscii() {
        // Given
        StringBuilder sb = new StringBuilder();
        String s = "é";
        UrlBuilder urlBuilder = new UrlBuilder(connection);

        // When
        urlBuilder.appendToAscii(s, true, sb);

        // Then
        assertEquals("%E9", sb.toString());
    }

}