package org.jsoup.nodes;

public class GeneratedTextNodeToString_UsesToStringMethod {

    @Test
    public void TextNodeToString_UsesToStringMethod() {
        String text = "Hello, World!";
        NodeUnderTest node = new NodeUnderTest(text);
        String actualString = node.toString();
        assertEquals("Hello, World!", actualString);
    }

}