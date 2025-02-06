package org.jsoup.nodes;

public class GeneratedSplitText_0_test {

    @Test
    public void splitText_0_test() {
        TextNode node = new TextNode("Hello\nWorld");
        TextNode result = node.splitText(0);
        assertNotNull(result);
        assertEquals("Hello", result.text());
    }

}