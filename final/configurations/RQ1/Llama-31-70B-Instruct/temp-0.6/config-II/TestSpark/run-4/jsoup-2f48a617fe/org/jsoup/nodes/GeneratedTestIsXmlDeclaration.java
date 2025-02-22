package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    Comment comment;

    @BeforeEach
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testIsXmlDeclaration() {
        Comment comment1 = new Comment("test");
        assertFalse(comment1.isXmlDeclaration());

        Comment comment2 = new Comment("!");
        assertTrue(comment2.isXmlDeclaration());
    }

}