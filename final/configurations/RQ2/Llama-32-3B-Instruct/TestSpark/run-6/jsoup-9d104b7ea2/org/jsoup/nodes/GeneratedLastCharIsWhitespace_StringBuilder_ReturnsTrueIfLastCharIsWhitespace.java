package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespace_StringBuilder_ReturnsTrueIfLastCharIsWhitespace {

    @Test
    public void lastCharIsWhitespace_StringBuilder_ReturnsTrueIfLastCharIsWhitespace() {
        // Given
        StringBuilder sb = new StringBuilder("   ");

        // When
        boolean isWhitespace = StringUtil.lastCharIsWhitespace(sb);

        // Then
        assertTrue(isWhitespace);
    }

}