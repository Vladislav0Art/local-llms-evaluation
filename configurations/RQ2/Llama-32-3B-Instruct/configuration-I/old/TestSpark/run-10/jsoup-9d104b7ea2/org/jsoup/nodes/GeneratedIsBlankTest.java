package org.jsoup.nodes;

public class GeneratedIsBlankTest {

    @Test
    public void isBlankTest() {
        String text = "";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());

        text = "   ";
        textNode = new TextNode(text);
        assertTrue(textNode.isBlank());

        text = "Hello World";
        textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}