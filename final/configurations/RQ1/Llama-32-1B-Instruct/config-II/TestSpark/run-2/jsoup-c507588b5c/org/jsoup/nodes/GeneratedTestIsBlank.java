package org.jsoup.nodes;

public class GeneratedTestIsBlank {

    @Test
    public void testIsBlank() {
        // Given
        String text = "";
        Document document = new Document();

        // When
        boolean result = textNodeIsBlank(text, document);

        // Then
        Assert.assertTrue(result);
    }

}