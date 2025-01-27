package org.jsoup.nodes;

public class GeneratedNodeName_textNotnull_returnsCorrectValue {

    @Test
    public void nodeName_textNotnull_returnsCorrectValue() {
        String nodeName = new TextNode("test").nodeName();
        assertEquals("text", nodeName);
    }

}