package org.jsoup.nodes;

public class GeneratedCreateCommentWithDataTest {

    @Test
    public void createCommentWithDataTest() {
        Comment comment = new Comment("<!-- This is a comment -->");
        assertEquals(1, comment.getData().length());
        assertTrue(comment.isXmlDeclaration());
    }

}