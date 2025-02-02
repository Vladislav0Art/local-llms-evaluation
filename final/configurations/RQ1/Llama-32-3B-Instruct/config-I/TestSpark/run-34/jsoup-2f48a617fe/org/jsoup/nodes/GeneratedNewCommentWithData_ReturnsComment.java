package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedNewCommentWithData_ReturnsComment {

    @Test
    public void newCommentWithData_ReturnsComment() {
        Comment comment = new Comment("some data");
        assertEquals("some data", comment.getData());
    }

}