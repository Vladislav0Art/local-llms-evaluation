package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneMethodReturnsNewCommentNodeTest {

    @Test
    public void cloneMethodReturnsNewCommentNodeTest() {
        Comment comment = new Comment("This is a test");
        Comment clonedComment = comment.clone();
        assertNotSame(comment, clonedComment);
    }

}