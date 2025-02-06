package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameCommentTest {

    @Test
    public void nodeNameCommentTest() {
        Comment comment = new Comment("data");
        assertEquals("", comment.nodeName());
    }

}