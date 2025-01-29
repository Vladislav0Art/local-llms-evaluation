package org.jsoup.parser;

public class GeneratedTest_insertDoctype_MultipleTokens {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertDoctype_MultipleTokens() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);
        Token.doctype d1 = mock(Token.class).DOCTYPE_TOKEN;
        Token.doctype d2 = mock(Token.class).DOCTYPE_TOKEN;

        // Act
        xmlTreeBuilder.insert(d1, d2);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}