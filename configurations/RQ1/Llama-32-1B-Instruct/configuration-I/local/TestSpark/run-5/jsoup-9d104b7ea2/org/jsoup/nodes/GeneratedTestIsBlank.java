package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    private static String html = "<p>  Hello World  </p>";

    @Test
    public void testIsBlank() {
        assertTrue(TextNode.isBlank(html));
        assertEquals(" ", TextNode.getText(html));
    }

}