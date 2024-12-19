package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        // Given
        String text = "Hello World";

        // When
        TextNode node = new TextNode(text);

        // Then
        Assert.assertNotNull(node.outerHtmlHead(new StringBuilder(), 0, null));
    }

}