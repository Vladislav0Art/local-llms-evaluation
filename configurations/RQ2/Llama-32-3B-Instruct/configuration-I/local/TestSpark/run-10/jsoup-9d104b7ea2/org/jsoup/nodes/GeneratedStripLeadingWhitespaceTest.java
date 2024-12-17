package org.jsoup.nodes;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        String text = "\t\tHello World";
        String expectedStripPEDText = "  Hello World";

        String actualStripPEDText = TextNode.stripLeadingWhitespace(text);
        assertEquals(expectedStripPEDText, actualStripPEDText);

        text = "   ";
        expectedStripPEDText = "";

        actualStripPEDText = TextNode.stripLeadingWhitespace(text);
        assertEquals(expectedStripPEDText, actualStripPEDText);
    }

}