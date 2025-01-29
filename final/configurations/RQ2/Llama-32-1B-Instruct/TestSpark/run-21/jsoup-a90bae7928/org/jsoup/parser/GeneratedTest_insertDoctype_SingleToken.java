package org.jsoup.parser;

public class GeneratedTest_insertDoctype_SingleToken {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertDoctype_SingleToken() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);
        Token.doctype d = mock(Token.class).DOCTYPE_TOKEN;

        // Act
        xmlTreeBuilder.insert(d);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}