package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_LeavesOriginalCharacters {

    @Test
    public void stripLeadingWhitespace_LeavesOriginalCharacters() {
        String originalText = "\n   \t";
        String strippedText = "Hello World!";
        assertTrue(strippedText.equals(originalText));
    }

}