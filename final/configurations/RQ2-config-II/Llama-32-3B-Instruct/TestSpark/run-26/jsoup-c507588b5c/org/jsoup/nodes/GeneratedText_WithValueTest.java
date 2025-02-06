package org.jsoup.nodes;

public class GeneratedText_WithValueTest {

    @Test
    public void text_WithValueTest() {
        TextNode textNode = new TextNode("test");
        textNode.text("new test");
        assertEquals("new test", textNode.text());
    }

}