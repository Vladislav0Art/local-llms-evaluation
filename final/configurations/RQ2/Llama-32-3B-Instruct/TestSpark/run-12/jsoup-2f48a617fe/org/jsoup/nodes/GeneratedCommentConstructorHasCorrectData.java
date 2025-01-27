package org.jsoup.nodes;

public class GeneratedCommentConstructorHasCorrectData {

    private static final String TEST_DATA = "test data";

    @Test
    public void CommentConstructorHasCorrectData() {
        Comment comment = new Comment(TEST_DATA);
        assertEquals(TEST_DATA, comment.getData());
    }

}