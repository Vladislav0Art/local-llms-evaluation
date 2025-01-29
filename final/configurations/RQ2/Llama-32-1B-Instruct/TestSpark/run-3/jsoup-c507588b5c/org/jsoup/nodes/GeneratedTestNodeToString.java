package org.jsoup.nodes;

public class GeneratedTestNodeToString {

    @Test
    public void testNodeToString() {
        // Arrange
        String[] expectedStrings = {"Hello, World!", "   Hello, World!   ", "", ""};

        // Act
        TextNode textNode = new TextNode("Hello, World!");
        assertEquals(expectedStrings[0], textNode.toString(), "");
    }

}