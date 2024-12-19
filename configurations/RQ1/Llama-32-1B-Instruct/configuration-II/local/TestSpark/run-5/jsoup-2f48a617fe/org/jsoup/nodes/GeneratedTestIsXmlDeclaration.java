package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    private Comment comment;

    @Before
    public void setUp() {
        ParseSettings parseSettings = new ParseSettings();
        parseSettings.setPreserveCase(true);
        String data = "# This is a comment";
        comment = new Comment(data);
    }

    @Test
    public void testIsXmlDeclaration() {
        // Arrange
        String data = "# This is an XML Declaration!";
        boolean result = comment.isXmlDeclaration();

        // Act
        boolean actual = comment.asXmlDeclaration().equals(null) || comment.asXmlDeclaration() instanceof XmlDeclaration;

        // Assert
        assertTrue(result && (actual || result));
    }

}