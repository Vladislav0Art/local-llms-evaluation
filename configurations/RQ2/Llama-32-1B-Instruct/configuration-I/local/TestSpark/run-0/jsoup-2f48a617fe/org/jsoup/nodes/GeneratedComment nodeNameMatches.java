package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

public class GeneratedComment nodeNameMatches {

    @Test
    public void comment

    nodeNameMatches() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

}