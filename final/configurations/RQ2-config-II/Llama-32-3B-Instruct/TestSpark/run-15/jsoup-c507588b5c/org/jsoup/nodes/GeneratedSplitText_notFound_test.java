package org.jsoup.nodes;

public class GeneratedSplitText_notFound_test {

    @Test
    public void splitText_notFound_test() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode result = node.splitText(5);
        assertNotNull(result);
        assertEquals("World", result.text());
    }

}