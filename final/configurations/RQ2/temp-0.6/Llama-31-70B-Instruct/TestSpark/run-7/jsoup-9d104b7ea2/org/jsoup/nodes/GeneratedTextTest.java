package org.jsoup.nodes;

public class GeneratedTextTest {

    @Test
    public void textTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("Test", textNode.text());
    }

}