package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello, World!";
        TextNode result = node.splitText(6);
        assertEquals("World", result.getText());
    }

}