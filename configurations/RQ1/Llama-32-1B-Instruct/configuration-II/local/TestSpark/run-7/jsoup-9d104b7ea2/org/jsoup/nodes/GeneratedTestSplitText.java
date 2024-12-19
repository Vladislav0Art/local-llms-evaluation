package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello\nWorld";
        TextNode node = new TextNode(text);
        Node sibling1 = node.splitText(0);
        Node sibling2 = node.splitText(8);

        assertEquals("Hello", sibling1.text());
        assertEquals("World", sibling2.text());
    }

}