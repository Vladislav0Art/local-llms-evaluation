package org.jsoup.nodes;

public class GeneratedGetData {

    @Test
    public void getData() {
        String data = "This is a comment";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}