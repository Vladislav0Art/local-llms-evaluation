package org.jsoup.nodes;

public class GeneratedTestIsXmlDeclaration {

    private Comment comment;

    @Before
    public void setup() {
        comment = new Comment("<!-- This is a comment -->");
    }

    @Test
    public void testIsXmlDeclaration() {
        boolean expected = false;
        assertTrue(comment.isXmlDeclaration());
        assertEquals("Comment", expected);
    }

}