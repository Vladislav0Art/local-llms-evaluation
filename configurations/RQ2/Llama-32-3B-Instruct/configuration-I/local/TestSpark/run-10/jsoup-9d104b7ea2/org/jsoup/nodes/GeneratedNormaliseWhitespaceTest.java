package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String text = "\t\tHello World";
        String expectedNormalisedText = "   Hello World";

        String actualNormalisedText = TextNode.normaliseWhitespace(text);
        assertEquals(expectedNormalisedText, actualNormalisedText);

        text = "  ";
        expectedNormalisedText = " ";

        actualNormalisedText = TextNode.normaliseWhitespace(text);
        assertEquals(expectedNormalisedText, actualNormalisedText);
    }

}