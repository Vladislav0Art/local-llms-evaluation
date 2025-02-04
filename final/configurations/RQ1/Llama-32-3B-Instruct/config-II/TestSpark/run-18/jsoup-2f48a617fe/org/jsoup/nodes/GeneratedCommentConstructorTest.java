package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedCommentConstructorTest {

    @Test
    public void CommentConstructorTest() {
        String data = "test";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

}