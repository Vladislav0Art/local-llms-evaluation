package org.jsoup.nodes;

public class GeneratedTextNodeConstructorTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

}