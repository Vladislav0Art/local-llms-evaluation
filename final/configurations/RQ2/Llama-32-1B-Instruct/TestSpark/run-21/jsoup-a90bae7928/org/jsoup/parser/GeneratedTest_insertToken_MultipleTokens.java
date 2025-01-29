package org.jsoup.parser;

public class GeneratedTest_insertToken_MultipleTokens {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertToken_MultipleTokens() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);
        Token.commentToken commentToken = mock(Token.class).COMMENT_TOKEN;
        token1 = mock(Token.class);

        // Act
        xmlTreeBuilder.insert(token1, commentToken);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}