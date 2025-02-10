package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void testCommentNodeName() {
        Comment comment = new Comment("#comment");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        String data = "#comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void testSetData() {
        String data = "#comment";
        Comment comment = new Comment(data);
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void testOuterHtmlHead() {
        Appendable accum = new StringBuilder();
        Document doc = new Document();
        Comment comment = new Comment("#comment");
        append(accum, comment.outerHtmlHead(doc, 0, null));
        assertEquals("<!--#comment-->", accum.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        Appendable accum = new StringBuilder();
        Document doc = new Document();
        Comment comment = new Comment("#comment");
        append(accum, comment.outerHtmlTail(doc, 0, null));
        assertEquals("<!--#comment-->", accum.toString());
    }

    @Test
    public void testIsXmlDeclaration() {
        String data = "#!hello world";
        Comment comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        String data = "#!hello world";
        Comment comment = new Comment(data);
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertTrue(decl != null);
        assertNotNull(decl.content());
    }

}