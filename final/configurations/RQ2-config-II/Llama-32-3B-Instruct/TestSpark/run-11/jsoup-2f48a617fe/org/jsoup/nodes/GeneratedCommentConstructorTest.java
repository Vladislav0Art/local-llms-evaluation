package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCommentConstructorTest {

    @Test
    public void commentConstructorTest() {
        String data = "Comment data";
        Comment comment = new Comment(data);
        assertNotNull(comment);
        assertEquals(data, comment.getData());
    }

}