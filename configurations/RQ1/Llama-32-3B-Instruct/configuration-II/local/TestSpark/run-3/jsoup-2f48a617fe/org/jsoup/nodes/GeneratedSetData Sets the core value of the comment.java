package org.jsoup.nodes;

public class GeneratedSetData Sets the core value of the comment {

    @Test
    public void setData
    Sets the
    core value
    of the

    comment() {
        String data = "New data";
        Comment comment = new Comment("old data");
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}