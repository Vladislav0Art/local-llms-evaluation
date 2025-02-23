package org.jsoup.nodes;

public class GeneratedTestNormaliseWhitespace {

    @Test
    public void testNormaliseWhitespace() {
        String text = "some    \n\n\t   text";
        String normalisedText = TextNode.normaliseWhitespace(text);
        assertEquals(normalisedText, "some text");
    }

}