package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedClone {

    @Test
    public void clone() {
        String data = "This is a comment";
        Comment originalComment = new Comment(data);
        Comment clonedComment = originalComment.clone();
        assertNotNull(clonedComment);
        assertEquals(originalComment.getData(), clonedComment.getData());
    }

}