package org.jsoup.nodes;

public class Generated[TextNode]

normaliseWhitespaceTest {

    @Test
    public void [TextNode]normaliseWhitespaceTest() {
        String text = "   Hello World  ";
        assertEquals("Hello World ", Normaliser.normaliseWhitespace(text));
    }

}