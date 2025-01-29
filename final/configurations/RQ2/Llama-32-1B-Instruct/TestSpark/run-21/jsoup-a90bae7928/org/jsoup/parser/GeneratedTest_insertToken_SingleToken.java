package org.jsoup.parser;

public class GeneratedTest_insertToken_SingleToken {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertToken_SingleToken() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);

        // Act
        xmlTreeBuilder.insert(node, token1);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}