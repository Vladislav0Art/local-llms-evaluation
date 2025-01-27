package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedOuterHtmlHead_appendsCorrectNodeTest {

    @Test
    public void outerHtmlHead_appendsCorrectNodeTest() throws java.io.IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Comment comment = new Comment("");
        comment.outerHtmlHead(new StringBuilder(), 0, null);
        assertEquals("<!-- test -->\n", outContent.toString());
        System.setOut(originalOut);
    }

}