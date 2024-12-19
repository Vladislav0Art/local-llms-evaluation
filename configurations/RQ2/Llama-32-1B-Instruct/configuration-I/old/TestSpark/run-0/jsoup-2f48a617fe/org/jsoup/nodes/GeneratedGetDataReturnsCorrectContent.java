package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedGetDataReturnsCorrectContent {

    @Test
    public void getDataReturnsCorrectContent() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        assertEquals(data, comment.getData());
    }

}