package org.jsoup.nodes;

public class GeneratedTextNodeToString_ReturnsText {

    @Test
    public void TextNodeToString_ReturnsText() {
        NodeUnderTest node = new NodeUnderTest("Hello, World!");
        String expectedString = "Hello, World!";
        String actualString = node.toString();
        assertEquals(expectedString, actualString);
    }

}