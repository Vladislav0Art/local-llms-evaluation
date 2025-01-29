package org.jsoup.nodes;

public class GeneratedTestCommentIsXmlDeclaration {

    @Test
    public void testCommentIsXmlDeclaration() {
        // Arrange
        Document document = new Document();
        Appendable accum = document.getAppendable();

        // Act
        comment = new Comment("");
        comment.setDATA("");

        // Assert
        assertTrue(comment.isXmlDeclaration());
    }

}