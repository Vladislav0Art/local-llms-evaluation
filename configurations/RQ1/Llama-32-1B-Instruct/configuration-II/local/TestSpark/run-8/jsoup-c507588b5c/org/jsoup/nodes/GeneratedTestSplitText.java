package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode node = new TextNode("Hello World!");
        TextNode result = node.splitText(5);
        assertEquals("Hello", result.text());
        assertEquals(6, result.getWholeText().length());
    }

}