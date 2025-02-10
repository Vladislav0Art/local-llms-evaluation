package org.jsoup.nodes;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        // Given
        String text = "Hello World!";
        Document document = new Document();
        Appendable appendable = new StringBuilder();

        // When
        outerHtmlHead(appendable, 0, document);

        // Then
        Assert.assertNotNull(appendable);
    }

}