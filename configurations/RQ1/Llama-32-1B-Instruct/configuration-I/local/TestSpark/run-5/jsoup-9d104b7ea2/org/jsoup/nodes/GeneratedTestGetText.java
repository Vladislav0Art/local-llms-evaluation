package org.jsoup.nodes;

public class GeneratedTestGetText {

    private static String html = "<p>  Hello World  </p>";

    @Test
    public void testGetText() {
        TextNode root = new TextNode(html);
        assertEquals("Hello World", root.getText());
    }

}