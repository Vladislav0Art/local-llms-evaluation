package org.jsoup.nodes;

public class GeneratedTest {

    private boolean isXmlDeclarationData(String data) {
        return !data.isEmpty() && data.charAt(0) == '-' && data.contains("-->");
    }

    public static class XmlDeclaration {
        private String data;

        public XmlDeclaration(String data) {
            this.data = data;
        }

        public boolean isXmlDeclarationData(String input) {
            return isXmlDeclarationData(this.data);
        }
    }

    @Test
    public void testGenerateXmlDeclaration() {
        // Arrange
        String input = "<!-- This is a comment -->";

        // Act
        XmlDeclaration xmlDeclaration = new XmlDeclaration(input);

        // Assert
        assertTrue(xmlDeclaration.isXmlDeclarationData(input));
    }

    @Test
    public void testGenerateEmptyXmlDeclaration() {
        // Arrange
        String input = "";

        // Act
        XmlDeclaration xmlDeclaration = new XmlDeclaration(input);

        // Assert
        assertFalse(xmlDeclaration.isXmlDeclarationData(input));
    }

}