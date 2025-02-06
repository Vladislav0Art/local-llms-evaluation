package org.jsoup.nodes;

public class GeneratedText_BasicTest {

    @Test
    public void text_BasicTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("test", textNode.text());
    }

}