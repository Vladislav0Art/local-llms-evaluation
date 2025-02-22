package org.jsoup.nodes;

public class GeneratedTest {

    Comment comment;

    @BeforeEach
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testNodeName() {
        assertEquals("#comment", comment.nodeName());
    }

    @Test
    public void testGetData() {
        assertEquals("test", comment.getData());
    }

    @Test
    public void testSetData() {
        comment.setData("new data");
        assertEquals("new data", comment.getData());
    }

    @Test
    public void testClone() {
        Comment commentClone = comment.clone();
        assertEquals(comment.getData(), commentClone.getData());
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment1 = new Comment("test");
        assertFalse(comment1.isXmlDeclaration());

        Comment comment2 = new Comment("!");
        assertTrue(comment2.isXmlDeclaration());
    }

    @Test
    public void testAsXmlDeclaration() {
        Comment comment1 = new Comment("test");
        assertNull(comment1.asXmlDeclaration());

        Comment comment2 = new Comment("!DOCTYPE html");
        XmlDeclaration xmlDeclaration = comment2.asXmlDeclaration();
        assertEquals("html", xmlDeclaration.name());
        assertTrue(xmlDeclaration.isProcessingInstruction());
    }

}