package org.jsoup.nodes;

public class GeneratedCommentGetDataReturnsCorrectData {

    private static final String TEST_DATA = "Test Data";

    @Test
    public void CommentGetDataReturnsCorrectData() {
        Comment comment = new Comment(TEST_DATA);
        String data = comment.getData();
        assertEquals(TEST_DATA, data);
    }

}