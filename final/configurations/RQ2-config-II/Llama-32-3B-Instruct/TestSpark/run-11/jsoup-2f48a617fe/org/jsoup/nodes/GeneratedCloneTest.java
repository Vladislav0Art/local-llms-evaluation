package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCloneTest {

    @Test
    public void cloneTest() {
        Comment comment = new Comment("Initial data");
        Comment clonedComment = comment.clone();
        assertNotNull(clonedComment);
        assertEquals(comment.getData(), clonedComment.getData());
    }

}