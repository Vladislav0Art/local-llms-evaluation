package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

public class GeneratedOuterHtmlTailAccumulatesEmptyString {

    @Test
    public void outerHtmlTailAccumulatesEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        int depth = 0;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, outSettings);
        assertEquals("", out.toString());
    }

}