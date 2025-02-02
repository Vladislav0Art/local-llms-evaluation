package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlShouldReturnCorrectString {

    @Test
    public void outerHtmlShouldReturnCorrectString() {
        Comment comment = new Comment("some data");
        String expectedOutput = "<!-- some data -->";
        assertEquals(expectedOutput, comment.toString());
    }

}