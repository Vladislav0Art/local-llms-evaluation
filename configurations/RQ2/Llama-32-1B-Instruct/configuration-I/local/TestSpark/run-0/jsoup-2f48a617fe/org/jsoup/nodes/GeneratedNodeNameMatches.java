package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;

public class GeneratedNodeNameMatches {

    @Test
    public void nodeNameMatches() {
        String data = "This is a test comment.";
        Comment comment = new Comment(data);
        assertEquals("comment", comment.nodeName());
    }

}