package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedNodeName_isCommentTest {

    @Test
    public void nodeName_isCommentTest() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}