package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        TextNode text = new TextNode("Hello World");
        TextNode result = text.splitText(6);
        assertEquals(new TextNode("World"), result);
    }

}