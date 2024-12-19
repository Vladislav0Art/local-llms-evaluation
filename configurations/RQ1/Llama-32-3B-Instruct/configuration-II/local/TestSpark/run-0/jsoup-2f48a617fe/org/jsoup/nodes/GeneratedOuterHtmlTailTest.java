package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void OuterHtmlTailTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Document document = new Document();
        Comment comment = new Comment("");
        Appendable accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, document.outputSettings());
        System.out.flush();
        String result = outContent.toString();
        assertTrue(result.contains(""));
    }

}