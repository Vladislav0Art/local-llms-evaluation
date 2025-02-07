package org.jsoup.nodes;

public class GeneratedTest splitText {

    @Test
    public void test

    splitText() {
        TextNode node = new TextNode("Hello World");
        String expectedText = "Hello World";
        assertEquals(expectedText, node.splitText(0));
        assertEquals("", node.splitText(1));
    }

}