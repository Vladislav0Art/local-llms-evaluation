package org.jsoup.nodes;

public class GeneratedCommentSetDataSetsNewDataAndUpdatesExistingValue {

    private static final String TEST_DATA = "test data";

    @Test
    public void CommentSetDataSetsNewDataAndUpdatesExistingValue() {
        Comment comment = new Comment(TEST_DATA);
        comment.setData("new data");
        String newData = comment.getData();
        assertNotNull(newData);
        assertEquals("new data", newData);
    }

}