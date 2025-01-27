package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedClone_returnsCorrectCommentTest {

    @Test
    public void clone_returnsCorrectCommentTest() {
        Comment comment = new Comment("");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertTrue(comment.equals(clonedComment));
    }

}