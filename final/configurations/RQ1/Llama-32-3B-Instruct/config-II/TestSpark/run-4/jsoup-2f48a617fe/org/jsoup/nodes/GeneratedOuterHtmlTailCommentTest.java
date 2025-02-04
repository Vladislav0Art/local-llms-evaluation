package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GeneratedOuterHtmlTailCommentTest {

    @Test
    public void outerHtmlTailCommentTest() throws IOException {
        Document doc = new Document();
        Appendable accum = new ArrayList<>();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<html>Comment text</html>");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}