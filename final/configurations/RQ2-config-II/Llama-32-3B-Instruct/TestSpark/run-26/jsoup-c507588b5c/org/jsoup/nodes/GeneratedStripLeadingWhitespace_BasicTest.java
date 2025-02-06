package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespace_BasicTest {

    @Test
    public void stripLeadingWhitespace_BasicTest() {
        String originalText = "   test ";
        String expectedText = "test";
        assertEquals(expectedText, TextNode.stripLeadingWhitespace(originalText));
    }

}