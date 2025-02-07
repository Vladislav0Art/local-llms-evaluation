package org.jsoup.nodes;

public class GeneratedTestGetWholeTextNonBlank {

    @Test
    public void testGetWholeTextNonBlank() {
        TextNode node = new TextNode("Hello World\nThis is a test");
        assertEquals("Hello World This is a test", node.getText());
    }

}