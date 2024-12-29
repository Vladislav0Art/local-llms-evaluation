package org.jsoup.parser;

public class GeneratedTestInsertComment {

    @Test
    public void testInsertComment() {
        // Arrange
        XmlTreeBuilder treeBuilder = new XmlTreeBuilder();
        Token commentToken = new Token.Comment();

        // Act
        Node node = treeBuilder.insert(commentToken);

        // Assert
        assertTrue(node instanceof Node);
    }

}