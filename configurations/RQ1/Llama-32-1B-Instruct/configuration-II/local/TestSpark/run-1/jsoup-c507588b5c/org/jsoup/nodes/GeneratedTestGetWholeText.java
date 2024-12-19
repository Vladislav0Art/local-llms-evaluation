package org.jsoup.nodes;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        String text = "Hello World";
        TextNode node = TextNode.text(text);

        assertEquals("Hello World", node.getText());
    }

}