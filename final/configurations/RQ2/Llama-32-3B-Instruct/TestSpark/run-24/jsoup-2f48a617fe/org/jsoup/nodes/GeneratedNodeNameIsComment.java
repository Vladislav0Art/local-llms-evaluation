package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeNameIsComment {

    @Test
    public void nodeNameIsComment() {
        Comment comment = new Comment("");
        assertEquals("", comment.nodeName());
    }

}