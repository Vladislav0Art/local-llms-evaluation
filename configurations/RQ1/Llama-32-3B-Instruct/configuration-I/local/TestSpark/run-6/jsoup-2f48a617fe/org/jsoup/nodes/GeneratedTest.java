package org.jsoup.nodes;

public class GeneratedTest {

    private String tagName;

    public Comment(String tagName) {
        this.tagName = tagName;
    }

    public boolean isXmlDeclaration() {
        return true;
    }

    public String getTagName() {
        return tagName;
    }
}

public class XmlDeclaration implements Comment {
    private String tagName;

    public XmlDeclaration(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XmlDeclaration that = (XmlDeclaration) o;
        return tagName.equals(that.tagName);
    }
}

public class GeneratedTest {

    @Test
    public void newCommentIsCreatedCorrectly() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void cloneCommentReturnsTheSameObject() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertSame(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationReturnsFalseForEmptyStringData() {
        String data = "";
        Comment comment = new Comment(data);
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationReturnsTrueForXmlDeclarationData() {
        String data = "!DOCTYPE html";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNullWhenNotAnXmlDeclaration() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertNull(comment.asXmlDeclaration());
    }

}