package org.jsoup.nodes;

public class GeneratedSetDataShouldUpdateCommentData {

    private static final String COMMENT_DATA = "Hello World";

    @Test
    public void setDataShouldUpdateCommentData() {
        Comment comment = new Comment(COMMENT_DATA);
        String newData = "New Data";
        comment.setData(newData);
        assertEquals(newData, comment.getData());
    }

}