package org.jsoup.parser;

public class GeneratedTest_insertCharacter_SingleToken {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertCharacter_SingleToken() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);
        Token character = mock(Token.class).CHARACTER_TOKEN;

        // Act
        xmlTreeBuilder.insert(character);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}