package org.jsoup.nodes;

public class GeneratedNewCommentHasCorrectData {

    private static final String EMPTY_COMMENT = "<!-- -->";

    @Test
    public void newCommentHasCorrectData() {
        Comment comment = new Comment(EMPTY_COMMENT);
        assertEquals(EMPTY_COMMENT, comment.getData());
    }

}