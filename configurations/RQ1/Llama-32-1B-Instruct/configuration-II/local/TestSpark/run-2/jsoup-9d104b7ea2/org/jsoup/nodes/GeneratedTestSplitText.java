package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Given
        String text = "Hello World";

        // When
        TextNode splitNode = new TextNode(splitText(0, text.length()));

        // Then
        Assert.assertNotNull(splitNode.getWholeText());
        Assert.assertTrue(text.contains(splitNode.getWholeText()));
    }

}