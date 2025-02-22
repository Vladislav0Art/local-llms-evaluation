package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testAsXmlDeclaration() {
        assertNull(comment.asXmlDeclaration());
        comment.setData("!comment");
        XmlDeclaration decl = comment.asXmlDeclaration();
        assertEquals("comment", decl.getTagName());
        assertTrue(decl.isProcessingInstruction());
    }

}