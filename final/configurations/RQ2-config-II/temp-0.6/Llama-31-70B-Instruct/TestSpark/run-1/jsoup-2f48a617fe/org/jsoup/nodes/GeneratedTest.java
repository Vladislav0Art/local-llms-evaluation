package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;

    @Test
    public void nodeNameTest() {
        comment = new Comment("data");
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void getDataTest() {
        comment = new Comment("data");
        assertEquals("data", comment.getData());
    }

    @Test
    public void setDataTest() {
        comment = new Comment("data");
        comment.setData("newData");
        assertEquals("newData", comment.getData());
    }

    @Test
    public void outerHtmlHeadTest() throws IOException {
        comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!--data-->", accum.toString());
    }

    @Test
    public void outerHtmlTailTest() throws IOException {
        comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

    @Test
    public void toStringTest() {
        comment = new Comment("data");
        assertEquals("Comment[data]", comment.toString());
    }

    @Test
    public void cloneTest() {
        comment = new Comment("data");
        Comment clone = comment.clone();
        assertNotNull(clone);
        assertNotSame(comment, clone);
        assertEquals("data", clone.getData());
    }

    @Test
    public void isXmlDeclarationTest() {
        comment = new Comment("data");
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void asXmlDeclarationTest() {
        comment = new Comment("data");
        assertNull(comment.asXmlDeclaration());
    }

}