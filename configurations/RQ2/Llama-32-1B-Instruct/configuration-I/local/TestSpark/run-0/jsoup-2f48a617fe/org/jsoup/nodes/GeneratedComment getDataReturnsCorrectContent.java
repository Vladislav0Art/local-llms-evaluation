package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedComment getDataReturnsCorrectContent {

    @Test
    public void comment

    getDataReturnsCorrectContent() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}