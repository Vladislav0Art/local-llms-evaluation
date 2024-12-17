package org.jsoup.nodes;

public class GeneratedGetData_ReturnsCommentData {

    @Test
    public void getData_ReturnsCommentData() {
        Comment comment = new Comment("Some data");
        String result = comment.getData();
        assertTrue(result.contains("Some data"));
    }

}