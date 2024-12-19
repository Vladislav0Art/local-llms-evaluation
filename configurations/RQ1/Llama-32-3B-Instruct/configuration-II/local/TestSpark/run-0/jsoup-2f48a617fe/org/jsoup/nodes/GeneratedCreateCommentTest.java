package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedCreateCommentTest {

    @Test
    public void CreateCommentTest() {
        Comment comment = new Comment("This is a test comment");
        assertEquals("#comment", comment.nodeName());
        assertEquals("This is a test comment", comment.getData());
    }

}