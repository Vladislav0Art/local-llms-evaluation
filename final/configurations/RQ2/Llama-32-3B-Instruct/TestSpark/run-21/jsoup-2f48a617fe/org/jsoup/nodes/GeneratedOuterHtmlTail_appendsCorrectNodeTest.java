package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedOuterHtmlTail_appendsCorrectNodeTest {

    @Test
    public void outerHtmlTail_appendsCorrectNodeTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Comment comment = new Comment("");
        try {
            comment.outerHtmlHead(null, 0, null);
        } catch (java.io.IOException e) {
        }
        assertEquals("<!-- test -->\n", outContent.toString());
        System.setOut(originalOut);
    }

}