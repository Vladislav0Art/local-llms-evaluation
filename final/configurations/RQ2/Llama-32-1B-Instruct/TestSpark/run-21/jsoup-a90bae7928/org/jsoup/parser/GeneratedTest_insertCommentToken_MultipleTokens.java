package org.jsoup.parser;

public class GeneratedTest_insertCommentToken_MultipleTokens {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertCommentToken_MultipleTokens() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);
        Token.commentToken commentToken1 = mock(Token.class).COMMENT_TOKEN;
        Token.commentToken commentToken2 = mock(Token.class).COMMENT_TOKEN;

        // Act
        xmlTreeBuilder.insert(commentToken1, commentToken2);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}