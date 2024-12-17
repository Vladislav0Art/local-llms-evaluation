package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameIsComment {

    @Test
    public void nodeNameIsComment() {
        public Comment comment = new public Comment("This is a comment");
        assertEquals("comment", comment.nodeName());
    }

}