package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedCommentDataGetterTest {

    @Test
    public void CommentDataGetterTest() {
        Comment comment = new Comment("test");
        assertEquals("test", comment.getData());
    }

}