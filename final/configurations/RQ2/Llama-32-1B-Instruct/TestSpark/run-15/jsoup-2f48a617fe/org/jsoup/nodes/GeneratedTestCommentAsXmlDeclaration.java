package org.jsoup.nodes;

public class GeneratedTestCommentAsXmlDeclaration {

    @Test
    public void testCommentAsXmlDeclaration() {
        // Arrange
        Document document = new Document();
        Appendable accum = document.getAppendable();

        // Act
        comment = new Comment("");
        XmlDeclaration declaration = comment.asXmlDeclaration();
        assertNotSame(declaration, comment.asXmlDeclaration());
    }

}