package org.jsoup.nodes;

public class GeneratedTestCommentCheckXmlDeclaration {


    private Comment comment;

    /**
     * Test that comment creation is atomic.
     */

    @Test
    public void testCommentCheckXmlDeclaration() {
        String data = "Example text";
        comment = new Comment(data);
        assertTrue(comment.isXmlDeclaration());
    }

}