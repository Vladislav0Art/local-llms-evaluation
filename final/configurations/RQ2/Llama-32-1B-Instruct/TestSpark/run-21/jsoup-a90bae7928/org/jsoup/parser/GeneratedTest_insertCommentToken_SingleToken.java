package org.jsoup.parser;

public class GeneratedTest_insertCommentToken_SingleToken {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertCommentToken_SingleToken() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);
        Token.commentToken commentToken = mock(Token.class).COMMENT_TOKEN;

        // Act
        xmlTreeBuilder.insert(commentToken);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}