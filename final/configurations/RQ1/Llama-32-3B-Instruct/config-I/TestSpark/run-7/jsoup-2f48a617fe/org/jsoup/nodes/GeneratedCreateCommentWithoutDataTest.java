package org.jsoup.nodes;

public class GeneratedCreateCommentWithoutDataTest {

    @Test
    public void createCommentWithoutDataTest() {
        Comment comment = new Comment("");
        assertNull(comment.getData());
        assertFalse(comment.isXmlDeclaration());
    }

}