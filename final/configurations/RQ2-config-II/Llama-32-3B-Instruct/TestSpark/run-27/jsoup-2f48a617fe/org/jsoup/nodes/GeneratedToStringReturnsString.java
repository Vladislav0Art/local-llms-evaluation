package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringReturnsString {

    @Test
    public void toStringReturnsString() {
        Comment comment = new Comment("test");
        assertEquals("<!-- test -->", comment.toString());
    }

}