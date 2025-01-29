package org.jsoup.parser;

public class GeneratedTest_parse_WithDocFragment {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_parse_WithDocFragment() {
        // Arrange
        String inputFragment = "<a>Hello</a><b>World!</b>";
        String baseUri = "http://example.com";
        Parser parser = mock(Parser.class);

        // Act
        xmlTreeBuilder.parse(inputFragment, baseUri);

        // Assert
        verify(document);
    }

}