package org.jsoup.nodes;

public class GeneratedSplitText_textLengthTest {

    @Test
    public void splitText_textLengthTest() {
        String expected = "Hello";
        TextNode node = new TextNode(expected);
        TextNode result1 = node.splitText(node.length());
        TextNode result2 = node.splitText(0);
        assertEquals("", result2.text());
    }

}