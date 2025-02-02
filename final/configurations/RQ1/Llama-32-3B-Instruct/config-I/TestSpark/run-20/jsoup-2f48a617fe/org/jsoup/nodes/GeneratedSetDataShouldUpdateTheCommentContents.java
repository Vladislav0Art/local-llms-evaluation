package org.jsoup.nodes;

public class GeneratedSetDataShouldUpdateTheCommentContents {

    @Test
    public void setDataShouldUpdateTheCommentContents() {
        Comment comment = new Comment("<!-- original data -->");
        String updatedData = "<!-- updated data -->";
        comment.setData(updatedData);
        assertEquals(updatedData, comment.getData());
    }

}