package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCloneReturnsCorrectComment {

    @Test
    public void cloneReturnsCorrectComment() {
        String data = "test";
        Comment comment = new Comment(data);
        Comment cloned = comment.clone();
        assertEquals(comment, cloned);
    }

}