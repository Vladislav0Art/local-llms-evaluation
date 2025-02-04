package org.jsoup.nodes;

public class GeneratedNewComment_dataIsSetCorrectly {

    @Test
    public void newComment_dataIsSetCorrectly() {
        String data = "Data";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}