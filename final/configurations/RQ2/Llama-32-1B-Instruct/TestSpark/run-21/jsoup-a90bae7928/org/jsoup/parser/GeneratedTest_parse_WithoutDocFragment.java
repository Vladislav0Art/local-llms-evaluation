package org.jsoup.parser;

public class GeneratedTest_parse_WithoutDocFragment {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_parse_WithoutDocFragment() {
        // Arrange
        Document document = null;
        String baseUri = "http://example.com";
        Parser parser = mock(Parser.class);

        // Act
        xmlTreeBuilder.parse(baseUri, baseUri);

        // Assert
        verify(document);
    }

}