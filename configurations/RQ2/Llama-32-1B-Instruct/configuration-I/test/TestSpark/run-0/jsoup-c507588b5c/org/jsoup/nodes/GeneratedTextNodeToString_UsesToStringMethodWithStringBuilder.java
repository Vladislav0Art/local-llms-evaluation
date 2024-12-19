package org.jsoup.nodes;

public class GeneratedTextNodeToString_UsesToStringMethodWithStringBuilder {

    @Test
    public void TextNodeToString_UsesToStringMethodWithStringBuilder() {
        String text = "Hello, World!";
        StringBuilder sb = new StringBuilder();
        NodeUnderTest node = new NodeUnderTest(text);
        sb.append(node.toString());
        String expectedString = "Hello, World!";
        String actualString = sb.toString();
        assertEquals(expectedString, actualString);
    }

}