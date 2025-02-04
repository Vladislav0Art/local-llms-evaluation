package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedToStringTest {

    @Test
    public void ToStringTest() {
        String expected = "<!--test-->";
        Comment comment = new Comment(expected);
        assertEquals(expected, comment.toString());
    }

}