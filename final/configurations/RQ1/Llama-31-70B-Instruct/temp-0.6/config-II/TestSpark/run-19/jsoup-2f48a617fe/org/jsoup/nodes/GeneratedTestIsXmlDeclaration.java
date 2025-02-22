package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("comment");
    }

    @Test
    public void testIsXmlDeclaration() {
        assertFalse(comment.isXmlDeclaration());
        comment.setData("!comment");
        assertTrue(comment.isXmlDeclaration());
    }

}