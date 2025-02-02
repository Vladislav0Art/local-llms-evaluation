package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.jsoup.nodes.Element;

import java.io.ByteArrayOutputStream;

import static org.junit.Assert.assertNull;

public class GeneratedNodeNameIsComment {

    @Test
    public void nodeNameIsComment() {
        Comment comment = new Comment("");
        assertEquals("comment", comment.nodeName());
    }

}