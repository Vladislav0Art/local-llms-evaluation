package org.jsoup.nodes;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace("Some Text");
        assertEquals("Some Text", normalisedText);
    }

}