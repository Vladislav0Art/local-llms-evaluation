package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a test comment -->");
    }

    @Test
    public void testIsXmlDeclaration() {
        assertTrue(comment.isXmlDeclaration());
        assertFalse(comment.isXmlDeclaration());
    }

}