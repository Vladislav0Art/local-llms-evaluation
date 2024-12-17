package org.jsoup.nodes;

public class GeneratedTestGenerateComment {

    private Comment comment;

    public XmlDeclaration(Comment comment) {
        this.comment = comment;
    }

    public static XmlDeclaration fromComment(Comment comment) {
        return new XmlDeclaration(comment);
    }

    public String getHtml() {
        return "xml_declaration";
    }
}

public class Comment {
    private String data;

    public Comment(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isXmlDeclaration() {
        return false;
    }

    public String nodeName() {
        return "node_name";
    }
}

public class CommentTests {

    @Test
    public void testGenerateComment() throws Exception {
        // Arrange
        Comment comment = new Comment("test");

        // Act
        XmlDeclaration xmlDeclaration = new XmlDeclaration(comment);

        // Assert
        assertEquals(comment, xmlDeclaration.comment);
        assertEquals(xmlDeclaration.getHtml(), "xml_declaration");
    }

}