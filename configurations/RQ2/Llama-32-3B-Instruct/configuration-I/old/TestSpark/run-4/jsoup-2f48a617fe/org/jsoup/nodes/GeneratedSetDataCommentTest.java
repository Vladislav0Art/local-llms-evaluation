package org.jsoup.nodes;

import org.jsoup.nodes.Comment;

import java.io.IOException;

public class GeneratedSetDataCommentTest {

    @Test
    public void setDataCommentTest() {
        Comment comment = new Comment("test");
        String data = "New comment";
        comment.setData(data);
        assertEquals(data, comment.getData());
    }

}