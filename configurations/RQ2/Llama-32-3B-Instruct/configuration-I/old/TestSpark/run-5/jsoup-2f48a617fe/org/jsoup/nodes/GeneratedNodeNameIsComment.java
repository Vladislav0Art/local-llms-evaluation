package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedNodeNameIsComment {

    @Test
    public void nodeNameIsComment() {
        Comment comment = new Comment("Hello World");
        assertEquals("comment", comment.nodeName());
    }

}