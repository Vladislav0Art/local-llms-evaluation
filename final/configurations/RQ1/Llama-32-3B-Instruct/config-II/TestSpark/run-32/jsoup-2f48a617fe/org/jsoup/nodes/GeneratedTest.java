package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newCommentHasCorrectData() {
        Comment comment = new Comment("<!-- comment -->");
        assertEquals("<!-- comment -->", comment.getData());
    }

    @Test
    public void newCommentReturnsCorrectNodeName() {
        Comment comment = new Comment("<!-- comment -->");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void dataIsPreservedInDataMethod() {
        Comment comment = new Comment(" <!-- comment --> ");
        assertEquals("<!-- comment -->", comment.getData());
    }

    @Test
    public void setDataSetsCorrectData() {
        Comment comment = new Comment("<!-- comment -->");
        comment.setData("<!-- new comment -->");
        assertEquals("<!-- new comment -->", comment.getData());
    }

    @Test
    public void outerHtmlHeadAddsCommentToDocumentOutput() throws IOException {
        Document document = Document.create();
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!-- comment-->", accum.toString());
    }

    @Test
    public void outerHtmlTailDoesNotAddAnything() {
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- comment -->");
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertTrue(accum.length() == 0);
    }

    @Test
    public void toStringReturnsOuterHtml() throws IOException {
        Appendable accum = new StringBuilder();
        Comment comment = new Comment("<!-- comment -->");
        comment.toString();
        assertEquals("<!-- comment-->", accum.toString());
    }

    @Test
    public void cloneReturnsCorrectComment() {
        Comment comment = new Comment("<!-- comment -->");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationReturnsTrueForValidData() {
        Comment comment = new Comment("<!DOCTYPE html>");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void isXmlDeclarationReturnsFalseForInvalidData() {
        Comment comment = new Comment("<!-- invalid data -->");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNullForInvalidData() {
        Comment comment = new Comment("<!DOCTYPE html>");
        assertNull(comment.asXmlDeclaration());
    }

}