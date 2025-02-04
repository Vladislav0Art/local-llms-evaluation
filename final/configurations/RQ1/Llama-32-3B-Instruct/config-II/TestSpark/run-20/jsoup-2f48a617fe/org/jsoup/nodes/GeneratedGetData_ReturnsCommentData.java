package org.jsoup.nodes;

public class GeneratedGetData_ReturnsCommentData {

    @Test
    public void getData_ReturnsCommentData() {
        Comment comment = new Comment("Hello World");
        assertEquals("Hello World", comment.getData());
    }

}