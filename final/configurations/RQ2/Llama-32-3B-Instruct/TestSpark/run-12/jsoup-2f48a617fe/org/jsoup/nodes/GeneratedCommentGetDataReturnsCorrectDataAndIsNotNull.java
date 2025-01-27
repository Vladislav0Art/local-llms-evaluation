package org.jsoup.nodes;

public class GeneratedCommentGetDataReturnsCorrectDataAndIsNotNull {

    private static final String TEST_DATA = "test data";

    @Test
    public void CommentGetDataReturnsCorrectDataAndIsNotNull() {
        Comment comment = new Comment(TEST_DATA);
        String data = comment.getData();
        assertNotNull(data);
        assertEquals(TEST_DATA, data);
    }

}