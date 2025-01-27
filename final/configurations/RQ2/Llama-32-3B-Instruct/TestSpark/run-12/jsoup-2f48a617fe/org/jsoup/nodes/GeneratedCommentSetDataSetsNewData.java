package org.jsoup.nodes;

public class GeneratedCommentSetDataSetsNewData {

    private static final String TEST_DATA = "Test Data";

    @Test
    public void CommentSetDataSetsNewData() {
        Comment comment = new Comment(TEST_DATA);
        comment.setData("New Data");
        String newData = comment.getData();
        assertEquals("New Data", newData);
    }

}