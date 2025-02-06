package org.jsoup.nodes;

public class GeneratedTest {

    @Test
    public void constructorCommentTest() {
        Comment comment = new Comment("testData");
        assertNotNull(comment);
        assertEquals("testData", comment.getData());
    }

    @Test
    public void nodeNameCommentTest() {
        Comment comment = new Comment("testData");
        assertEquals("", comment.nodeName());
    }

    @Test
    public void setDataCommentTest() {
        Comment comment = new Comment("");
        String data = "newData";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

    @Test
    public void outerHtmlHeadCommentTest() throws IOException {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        // test implementation not implemented here
    }

    @Test
    public void outerHtmlTailCommentTest() {
        Appendable accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        // test implementation not implemented here
    }

    @Test
    public void toStringCommentTest() {
        Comment comment = new Comment("testData");
        String expected = "<!--testData-->";
        assertEquals(expected, comment.toString());
    }

    @Test
    public void cloneCommentTest() {
        Comment comment = new Comment("");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment.getData(), cloned.getData());
    }

    @Test
    public void isXmlDeclarationCommentTest() {
        Comment comment = new Comment("testData");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationCommentTest() throws IOException {
        Comment comment = new Comment("");
        XmlDeclaration xmlDeclaration = comment.asXmlDeclaration();
        assertNotNull(xmlDeclaration);
        // test implementation not implemented here
    }

}