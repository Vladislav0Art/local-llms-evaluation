package org.jsoup.nodes;

public class GeneratedTestParser {

    @Test
    public void testParser() {
        // Given
        Parser parser = new Parser();

        // When
        Document document = new Document("<html><body>Hello World!</body></html>", parser);

        // Then
        Assert.assertNotNull(document.parser());
    }

}