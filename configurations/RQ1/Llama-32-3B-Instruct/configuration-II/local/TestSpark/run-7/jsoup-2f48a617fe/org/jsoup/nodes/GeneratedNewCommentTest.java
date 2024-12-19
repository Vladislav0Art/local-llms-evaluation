package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNewCommentTest {

    @Test
    public void newCommentTest() {
        Comment comment = new Comment("test data");
        assertEquals("test data", comment.getData());
    }

}