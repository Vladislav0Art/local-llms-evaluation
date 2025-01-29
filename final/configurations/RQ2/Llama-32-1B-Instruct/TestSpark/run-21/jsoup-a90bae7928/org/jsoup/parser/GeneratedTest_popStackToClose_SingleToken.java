package org.jsoup.parser;

public class GeneratedTest_popStackToClose_SingleToken {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_popStackToClose_SingleToken() {
        // Arrange
        Token endTag = mock(Token.class).END_TAG_TOKEN;
        xmlTreeBuilder.popStackToClose(endTag);

        // Act
        xmlTreeBuilder.insert(token1);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}