package org.jsoup.nodes;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        // Given
        String text = "Hello World!";
        Document document = new Document();
        TextNode node = textNodeFromText(text, document);

        // When
        TextNode result = node.splitText(5);

        // Then
        Assert.assertNotNull(result);
        Assert.assertEquals(6, result.getSiblingIndex());
    }

}