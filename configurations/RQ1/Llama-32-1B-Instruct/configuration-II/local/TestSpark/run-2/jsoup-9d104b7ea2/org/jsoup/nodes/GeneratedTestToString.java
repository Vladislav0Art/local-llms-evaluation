package org.jsoup.nodes;

public class GeneratedTestToString {

    @Test
    public void testToString() {
        // Given
        Node node = new TextNode("Hello World");

        // When
        String result = node.toString();

        // Then
        Assert.assertNotNull(result);
        Assert.contains("Hello World", result);
    }

}