package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

public class GeneratedCloneCommentReturnsNewInstance {

    @Test
    public void cloneCommentReturnsNewInstance() {
        Comment comment = new Comment("data");
        Comment cloned = comment.clone();
        assertNotNull(cloned);
        assertEquals(comment, cloned);
    }

}