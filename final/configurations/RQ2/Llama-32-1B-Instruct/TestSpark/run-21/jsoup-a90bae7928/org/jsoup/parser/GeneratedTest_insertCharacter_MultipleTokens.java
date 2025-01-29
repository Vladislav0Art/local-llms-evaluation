package org.jsoup.parser;

public class GeneratedTest_insertCharacter_MultipleTokens {

    private Document document;
    private XmlTreeBuilder xmlTreeBuilder;

    @Test
    public void test_insertCharacter_MultipleTokens() {
        // Arrange
        Node node = new Document();
        xmlTreeBuilder.insert(node);
        Token.characterToken character1 = mock(Token.class).CHARACTER_TOKEN;
        Token.characterToken character2 = mock(Token.class).CHARACTER_TOKEN;

        // Act
        xmlTreeBuilder.insert(character1, character2);

        // Assert
        verify(xmlTreeBuilder.parse(input, baseUri));
    }

}