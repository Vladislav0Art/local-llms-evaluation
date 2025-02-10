package org.jsoup.nodes;

public class GeneratedTestSplitTextNoResult {

    @Test
    public void testSplitTextNoResult() {
        // Given
        String text = "Hello World!";
        Document document = new Document();
        TextNode node = textNodeFromText(text, document);

        // When
        TextNode result = node.splitText(10);

        // Then
        Assert.assertFalse(result);
    }

}