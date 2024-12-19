package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    @Test
    public void testIsXmlDeclaration() {
        // Arrange
        String data = "/*\n*   * This is a test \n*/";
        XmlDeclaration expected = new XmlDeclaration("<!DOCTYPE html PUBLIC \"-//W3C/DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\n<html xmlns=\"http://www.w3.org/1999/xhtml\"><body>\n    /*\n    *   *\n    */\n</body></html>");

        // Act
        Comment comment = new Comment(data);

        // Assert
        assertTrue(comment.isXmlDeclaration());
        assertEquals(expected, comment.asXmlDeclaration());
    }

}