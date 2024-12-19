package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNodeNameIsEmptyString {

    @Test
    public void nodeNameIsEmptyString() {
        Comment comment = new Comment("");
        assertTrue(comment.nodeName().isEmpty());
    }

}