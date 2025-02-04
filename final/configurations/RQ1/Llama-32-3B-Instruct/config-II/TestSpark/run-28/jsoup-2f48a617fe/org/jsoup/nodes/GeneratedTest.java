package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void createCommentNode() {
        Comment comment = new Comment("test");
        assertEquals("#comment", comment.nodeName());
        assertNotEquals("", comment.getData());
    }

    @Test
    public void checkXmlDeclarationData() {
        Comment comment = new Comment("!xml version \"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclarationData(comment.getData()));
    }

    @Test
    public void attemptToCastCommentToXmlDeclaration() {
        Comment comment = new Comment("?xml version \"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

    @Test
    public void setXmlDeclarationData() {
        Comment comment = new Comment("test");
        comment.setData("!xml version \"1.0\" encoding=\"UTF-8\"");
        assertTrue(comment.isXmlDeclarationData(comment.getData()));
    }

    @Test
    public void attemptToCastEmptyCommentToXmlDeclaration() {
        Comment comment = new Comment("");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNull(decl);
    }

    @Test
    public void outerHtmlHeadShouldAppendCommentData() {
        Comment comment = new Comment("test");
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        outerHtmlHead(comment, depth, out).when(accum::append).thenReturn(accum);
    }

    @Test
    public void cloneShouldReturnSameCommentNode() {
        Comment comment = new Comment("test");
        Comment clonedComment = comment.clone();
        assertEquals(comment, clonedComment);
    }

    @Test
    public void isXmlDeclarationShouldReturnFalseForNonXmlData() {
        Comment comment = new Comment("not xml");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationShouldNotBeNullForXmlData() {
        Comment comment = new Comment("!xml version \"1.0\" encoding=\"UTF-8\"");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertNotNull(decl);
    }

}