package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;

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
    public void constructorHasCorrectData() {
        String data = "Some comment content";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void nodeNameReturnsCorrectName() {
        Comment comment = new Comment("Some comment");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void getDataReturnsCorrectValue() {
        String data = "Some comment content";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void setDataUpdatesDataProperly() {
        String originalData = "Some comment content";
        String newData = "New comment content";
        Comment comment = new Comment(originalData);
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

    @Test
    public void outerHtmlTailAppendsCorrectHtml() {
        Appendable accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("Some comment");
        comment.outerHtmlTail(accum, 0, out);
        String expectedHtml = "</!-- Some comment -->";
        assertEquals(expectedHtml, accum.toString());
    }

    @Test
    public void toStringReturnsCorrectString() {
        Comment comment = new Comment("Some comment");
        String expectedString = "<!-- Some comment -->";
        assertEquals(expectedString, comment.toString());
    }

    @Test
    public void cloneCreatesNewComment() {
        Comment originalComment = new Comment("Some comment");
        Comment clonedComment = originalComment.clone();
        assertNotSame(originalComment, clonedComment);
    }

    @Test
    public void isXmlDeclarationReturnsFalseForNonDeclaration() {
        Comment comment = new Comment("Some comment");
        assertFalse(comment.isXmlDeclaration());
    }

}