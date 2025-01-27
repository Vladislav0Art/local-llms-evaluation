package org.jsoup.nodes;

public class GeneratedLastCharIsWhitespaceGivenNonWhitespaceCharacterThrowsException {

    @Test
    public void lastCharIsWhitespaceGivenNonWhitespaceCharacterThrowsException() {
        StringBuilder sb = new StringBuilder();
        assertTrue(lastCharIsWhitespace(sb));
    }

}