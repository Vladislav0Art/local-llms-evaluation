package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("", outContent.toString());
    }

}