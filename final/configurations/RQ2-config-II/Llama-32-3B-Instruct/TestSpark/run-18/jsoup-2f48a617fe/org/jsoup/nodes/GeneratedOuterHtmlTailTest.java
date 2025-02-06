package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("");
        Appendable accum = "";
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(true);
    }

}