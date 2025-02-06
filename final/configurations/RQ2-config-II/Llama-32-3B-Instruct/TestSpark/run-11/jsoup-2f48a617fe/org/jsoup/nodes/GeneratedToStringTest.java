package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedToStringTest {

    @Test
    public void toStringTest() {
        Comment comment = new Comment("Data");
        String expectedOutput = "<!-- Data -->";
        assertEquals(expectedOutput, comment.toString());
    }

}