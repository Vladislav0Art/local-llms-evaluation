package org.jsoup.nodes;

public class GeneratedTest {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("Some comment");
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        assertEquals("Some comment", comment.getData());
    }

    @Test
    public void testSetData() {
        comment.setData("New comment");
        assertEquals("New comment", comment.getData());
    }

    @Test
    public void testOuterHtmlHead() {
        StringWriter writer = new StringWriter();
        comment.outerHtmlHead(writer, 0, new Document.OutputSettings());
        assertEquals("<!--Some comment-->", writer.toString());
    }

    @Test
    public void testOuterHtmlTail() {
        StringWriter writer = new StringWriter();
        comment.outerHtmlTail(writer, 0, new Document.OutputSettings());
        assertEquals("", writer.toString());
    }

    @Test
    public void testToString() {
        assertEquals("<!--Some comment-->", comment.toString());
    }

    @Test
    public void testClone() {
        Comment clone = comment.clone();
        assertNotSame(comment, clone);
        assertEquals(comment.getData(), clone.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        assertFalse(comment.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        assertNull(comment.asXmlDeclaration());
    }

}