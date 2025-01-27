package org.jsoup.nodes;

public class GeneratedSplitTextTest {

    @Test
    public void splitTextTest() {
        TextNode node = new TextNode("test");
        TextNode result = node.splitText(5);
        assertEquals("t", result.text());
    }

}