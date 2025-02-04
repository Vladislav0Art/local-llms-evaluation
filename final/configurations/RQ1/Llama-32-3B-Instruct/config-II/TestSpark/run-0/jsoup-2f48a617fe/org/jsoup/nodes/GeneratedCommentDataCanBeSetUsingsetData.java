package org.jsoup.nodes;

public class GeneratedCommentDataCanBeSetUsingsetData {

    @Test
    public void commentDataCanBeSetUsingsetData() {
        Comment comment = new Comment("Initial Data");
        comment.setData("New Data");
        assertEquals("New Data", comment.getData());
    }

}