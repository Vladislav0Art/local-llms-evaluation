package org.jsoup.nodes;

public class GeneratedTestAsXmlDeclaration {

    Comment comment;

    @BeforeEach
    public void setUp() {
        comment = new Comment("test");
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