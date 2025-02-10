package org.jsoup.nodes;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        // Given
        String text = "Hello World!";
        Document document = new Document();
        Appendable appendable = new StringBuilder();

        // When
        outerHtmlTail(appendable, 0, document);

        // Then
        Assert.assertNotNull(appendable);
    }

}