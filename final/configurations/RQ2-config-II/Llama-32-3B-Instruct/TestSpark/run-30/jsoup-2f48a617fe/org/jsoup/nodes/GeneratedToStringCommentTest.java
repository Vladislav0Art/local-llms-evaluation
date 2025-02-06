package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringCommentTest {

    @Test
    public void toStringCommentTest() {
        Comment comment = new Comment("data");
        String expectedOutput = "<!-- data -->";
        assertEquals(expectedOutput, comment.toString());
    }

}