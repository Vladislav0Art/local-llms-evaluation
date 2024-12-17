package org.jsoup.nodes;

public class GeneratedTest {

    private String data;
    private Document document;

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
        return false; // Not an XML declaration
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}

public class Document {
    public String toString() {
        return "";
    }
}

public class CommentTest {

    @Test
    public void nodeName_ReturnsExpectedValue() {
        // Arrange
        Comment comment = new Comment("");

        // Act
        String actual = comment.nodeName();

        // Assert
        assertEquals("", comment.nodeName());
    }

    @Test
    public void getData_SetsDataCorrectly() {
        // Arrange
        Comment comment = new Comment("");
        String data = "test";

        // Act
        comment.setData(data);

        // Assert
        assertNotNull(comment.getData());
        assertTrue(comment.getData().equals(data));
    }

}