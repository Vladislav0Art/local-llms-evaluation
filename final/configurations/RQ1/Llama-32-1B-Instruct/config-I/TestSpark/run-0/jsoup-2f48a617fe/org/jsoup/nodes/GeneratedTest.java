package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testCommentNodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        Comment comment = new Comment("");
        assertEquals("", comment.getData());
    }

    @Test
    public void testSetData() {
        Comment comment = new Comment("");
        comment.setData("");
        assertEquals("", comment.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment = new Comment("!xml declaration");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment = new Comment("test content");
        XmlDeclaration xmlDecl = comment.asXmlDeclaration();
        assertEquals("<!xml version=\"1.0\" encoding=\"UTF-8\"?><!-- test content -->", xmlDecl.getContent());
    }

    @Test
    public void testOuterHtmlHead() {
        Comment comment = new Comment("");
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Document.OutputSettings.PrettyPrint(true));
        assertEquals("<!-- test content -->", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Comment comment = new Comment("test content");
        comment.outerHtmlTail(new StringBuilder(), 0, Document.OutputSettings());
    }

}