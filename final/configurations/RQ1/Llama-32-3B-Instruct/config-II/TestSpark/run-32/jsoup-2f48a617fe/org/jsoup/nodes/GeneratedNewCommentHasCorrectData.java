package org.jsoup.nodes;

public class GeneratedNewCommentHasCorrectData {

    @Test
    public void newCommentHasCorrectData() {
        Comment comment = new Comment("<!-- comment -->");
        assertEquals("<!-- comment -->", comment.getData());
    }

}