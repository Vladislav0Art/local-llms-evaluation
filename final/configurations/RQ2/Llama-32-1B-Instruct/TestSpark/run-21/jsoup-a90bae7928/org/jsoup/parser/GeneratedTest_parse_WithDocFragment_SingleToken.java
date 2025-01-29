package org.jsoup.parser;

public class GeneratedTest_parse_WithDocFragment_SingleToken {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_parse_WithDocFragment_SingleToken() {
        // Arrange
        String inputFragment = "<a>Hello</a>";
        String baseUri = "http://example.com";
        Parser parser = mock(Parser.class);
        Token token = mock(Token.class);

        // Act
        xmlTreeBuilder.parse(inputFragment, baseUri);

        // Assert
        verify(document);
    }

}