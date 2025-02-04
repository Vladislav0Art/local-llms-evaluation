package org.jsoup.nodes;

public class GeneratedSetDataShouldUpdateData {

    private Comment comment;

    @Test
    public void setDataShouldUpdateData() {
        comment = new Comment("test comment");
        comment.setData("New data");
        assertEquals("New data", comment.getData());
    }

}