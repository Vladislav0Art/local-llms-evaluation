package org.jsoup.parser;

public class GeneratedTest_popStackToClose_MultipleTokens {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_popStackToClose_MultipleTokens() {
        // Arrange
        Token.endTag = mock(Token.class).END_TAG_TOKEN;
        xmlTreeBuilder.popStackToClose(endTag);

        // Act
        token1 = mock(Token.class);
        xmlTreeBuilder.insert(token1);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}