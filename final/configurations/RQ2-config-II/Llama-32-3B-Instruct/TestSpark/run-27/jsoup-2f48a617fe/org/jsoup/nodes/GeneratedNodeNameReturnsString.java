package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameReturnsString {

    @Test
    public void nodeNameReturnsString() {
        Comment comment = new Comment("test");
        assertEquals("comment", comment.nodeName());
    }

}