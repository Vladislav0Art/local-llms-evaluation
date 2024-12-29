package org.jsoup.parser;

public class GeneratedTestProcessCharacter {

    @Test
    public void testProcessCharacter() {
        // Arrange
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token token = new Token.Character('a');

        // Act
        boolean result = treeBuilder.process(token);

        // Assert
        assertFalse(result);  // since 'a' is not a valid character in XML
    }

}