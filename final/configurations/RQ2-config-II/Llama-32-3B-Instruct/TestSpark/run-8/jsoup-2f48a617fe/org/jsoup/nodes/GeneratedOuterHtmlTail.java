package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Appendable;
import org.jsoup.parser.ParseSettings;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail {

    @Test
    public void outerHtmlTail() {
        Appendable accum = new StringBuilder();
        int depth = 1;
        Document.OutputSettings out = Document.OutputSettings.empty();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", accum.toString());
    }

}