package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void textNodeConstructorTest() {
        TextNode textNode = new TextNode("text");
        assertEquals("text", textNode.text());
    }

    @Test
    public void textNodeConstructorNullTextTest() {
        TextNode textNode = new TextNode(null);
    }

}