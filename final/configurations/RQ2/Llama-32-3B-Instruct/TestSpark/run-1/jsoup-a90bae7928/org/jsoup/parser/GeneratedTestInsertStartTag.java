package org.jsoup.parser;

public class GeneratedTestInsertStartTag {

    @Test
    public void testInsertStartTag() {
        // Arrange
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token.StartTag();

        // Act
        Element element = treeBuilder.insert(token);

        // Assert
        assertTrue(element instanceof Element);
    }

}