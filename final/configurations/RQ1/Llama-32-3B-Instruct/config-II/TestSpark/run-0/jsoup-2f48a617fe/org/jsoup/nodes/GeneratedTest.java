package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void newComment

    CreatesNewComment() {
        Comment comment = new Comment("This is a comment");
        assertNotNull(comment);
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a comment", comment.getData());
    }

    @Test
    public void newCommentHasDefaultData() {
        Comment comment = new Comment();
        assertNull(comment.getTagName());
    }

    @Test
    public void commentDataIsPreservedWhenCloned() {
        Comment originalComment = new Comment("Original Data");
        Comment clonedComment = originalComment.clone();
        assertEquals(originalComment.getData(), clonedComment.getData());
    }

    @Test
    public void commentDataCanBeSetUsingsetData() {
        Comment comment = new Comment("Initial Data");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

    @Test
    public void outerHtmlHeadIsNotCalledWhenPrettyPrintIsFalse() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(false);
        Comment comment = new Comment("Comment Data");
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, depth, out));
    }

    @Test
    public void outerHtmlHeadIsCalledWhenPrettyPrintIsTrueAndThisIsABlockComment() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("Block Comment");
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, depth, out));
    }

    @Test
    public void outerHtmlHeadIsCalledWhenPrettyPrintIsTrueAndThisIsATailComment() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("Tail Comment");
        assertThrows(IOException.class, () -> comment.outerHtmlHead(accum, depth, out));
    }

    @Test
    public void outerHtmlHeadIncludesCommentData() throws IOException {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("Comment Data");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--Comment Data-->", accum.toString());
    }

    @Test
    public void outerHtmlTailIsNotCalled() {
        Comment comment = new Comment();
        assert (comment.outerHtmlTail(null, 0, null) == null);
    }

    @Test
    public void cloneReturnsNewInstance() {
        Comment originalComment = new Comment("Original Data");
        Comment clonedComment = originalComment.clone();
        assertNull(originalComment.getTagName());
        assertNotNull(clonedComment.getTagName());
        assertEquals("#comment", clonedComment.nodeName());
    }

    @Test
    public void isXmlDeclarationReturnsFalseForNormalComments() {
        Comment comment = new Comment("Normal Data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationReturnsNullIfDataDoesNotLookLikeXMLDeclaration() {
        Comment comment = new Comment("Invalid Data");
        assert null == comment.asXmlDeclaration();
    }

    @Test
    public void asXmlDeclarationReturnsValidXMLDeclarationForCorrectData() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        assertTrue(xmlDeclaration.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTreatsTailCommentsAsComment() {
        Comment comment = new Comment("!xml version=\"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNull(xmlDeclaration);
    }

    @Test
    public void toStringIncludesOuterHtmlContent() {
        Document document = new Document();
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings(true);
        Comment comment = new Comment("Comment Data");
        String outerHtml = comment.toString();
        assertEquals("<!--Comment Data-->", outerHtml.substring(0, outerHtml.length() - 1));
    }

}