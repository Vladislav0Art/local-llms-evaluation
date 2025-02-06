package org.jsoup.nodes;

public class GeneratedNodeName_BasicTest {

    @Test
    public void nodeName_BasicTest() {
        TextNode textNode = new TextNode("test");
        assertEquals("text", textNode.nodeName());
    }

}