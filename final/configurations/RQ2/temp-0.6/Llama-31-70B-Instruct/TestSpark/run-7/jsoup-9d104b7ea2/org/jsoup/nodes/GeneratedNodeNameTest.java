package org.jsoup.nodes;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Test");
        assertEquals("text", textNode.nodeName());
    }

}