package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        assertEquals("comment", comment.getData());
    }

    @Test
    public void testSetData() {
        comment.setData("new comment");
        assertEquals("new comment", comment.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        assertFalse(comment.isXmlDeclaration());
        comment.setData("!comment");
        assertTrue(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        assertNull(comment.asXmlDeclaration());
        comment.setData("!comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertEquals("comment", decl.getTagName());
        assertTrue(decl.isProcessingInstruction());
    }

    @Test
    public void testOuterHtmlHead() throws IOException {
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, new Document("").outputSettings());
        assertEquals("<!--comment-->", sb.toString());
    }

    @Test
    public void testOuterHtmlTail() throws IOException {
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlTail(sb, 0, new Document("").outputSettings());
        assertEquals("", sb.toString());
    }

    @Test
    public void testToString() {
        assertEquals("<!--comment-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment clone = comment.clone();
        assertEquals("#comment", clone.nodeName());
        assertEquals("comment", clone.getData());
    }

}