package org.jsoup.nodes;

public class GeneratedTestCreatedComment {

    private String data;

    public Comment() {
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Comment createEmpty() {
        return new Comment();
    }
}

public class XmlDeclaration {
    private String data;

    public XmlDeclaration() {
    }

    public XmlDeclaration(String data) {
        this.data = data;
    }

    public static XmlDeclaration fromXml(String xml) {
        // implementation of parsing logic
        return null; // placeholder for actual parsing logic
    }

    public String asXmlDeclaration() {
        return "<!--" + data + "-->";
    }
}

public class GeneratedTest {

    @Test
    public void testCreatedComment() {
        // Given
        Comment comment = new Comment();
        comment.setData("<!--data-->");

        // When
        XmlDeclaration createdComment = comment.asXmlDeclaration();

        // Then
        assertEquals("<!--data-->", createdComment.data());
    }

}