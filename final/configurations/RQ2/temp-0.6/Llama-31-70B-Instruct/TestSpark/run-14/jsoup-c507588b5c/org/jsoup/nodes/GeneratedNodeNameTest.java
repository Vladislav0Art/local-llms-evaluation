package org.jsoup.nodes;

public class GeneratedNodeNameTest {

    @Test
    public void nodeNameTest() {
        TextNode textNode = new TextNode("Some Text");
        assertEquals("Some Text", textNode.nodeName());
    }

}