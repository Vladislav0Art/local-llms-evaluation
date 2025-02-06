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

public class GeneratedOuterHtmlHeadAccumulatesEmptyString {

    @Test
    public void outerHtmlHeadAccumulatesEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        Appendable accum = out;
        int depth = 0;
        Document.OutputSettings outSettings = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, outSettings);
        assertEquals("", out.toString());
    }

}