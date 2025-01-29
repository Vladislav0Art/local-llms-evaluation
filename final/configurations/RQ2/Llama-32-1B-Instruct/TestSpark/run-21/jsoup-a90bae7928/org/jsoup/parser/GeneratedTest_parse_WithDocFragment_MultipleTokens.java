package org.jsoup.parser;

public class GeneratedTest_parse_WithDocFragment_MultipleTokens {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_parse_WithDocFragment_MultipleTokens() {
        // Arrange
        String inputFragment = "<a>Hello</a><b>World!</b>";
        String baseUri = "http://example.com";
        Parser parser = mock(Parser.class);
        Token token1 = mock(Token.class);
        Token token2 = mock(Token.class);

        // Act
        xmlTreeBuilder.parse(inputFragment, baseUri);

        // Assert
        verify(document);
    }

}