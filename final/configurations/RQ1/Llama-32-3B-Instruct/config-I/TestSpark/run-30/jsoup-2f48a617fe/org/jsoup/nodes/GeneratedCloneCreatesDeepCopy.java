package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCloneCreatesDeepCopy {

    @Test
    public void cloneCreatesDeepCopy() {
        String data = "Hello, world!";
        Comment comment = new Comment(data);
        Comment clonedComment = comment.clone();
        assertNotSame(comment, clonedComment);
        assertEquals(comment.getNodeName(), clonedComment.getNodeName());
    }

}