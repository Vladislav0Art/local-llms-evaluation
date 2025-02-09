package org.jsoup.nodes;

public class GeneratedSplitText_NonZeroOffset_SplitsProperly {

    @Test
    public void splitText_NonZeroOffset_SplitsProperly() throws IOException {
        String text = "Hello, World!";
        TextNode node = new TextNode(text);
        assertEquals("Hello", node.splitText(7).text());
    }

}