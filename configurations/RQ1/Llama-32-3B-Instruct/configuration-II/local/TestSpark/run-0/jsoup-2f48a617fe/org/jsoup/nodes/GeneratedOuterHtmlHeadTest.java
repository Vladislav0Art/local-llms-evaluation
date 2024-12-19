package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void OuterHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        Document document = new Document();
        Element element = new Element("div");
        Comment comment = new Comment("");
        document.appendChild(comment);
        document.appendChild(element);
        Appendable accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, document.outputSettings());
        System.out.flush();
        String result = outContent.toString();
        assertEquals("<!--This is a test comment-->", result);
    }

}