package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedOuterHtmlTail_setsCorrectHtml {

    @Test
    public void outerHtmlTail_setsCorrectHtml() {
        Comment comment = new Comment("");
        ByteArrayOutputStream accum = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings out = null;
        comment.outerHtmlTail(accum, depth, out);
        String html = accum.toString().trim();
        assertTrue(html.endsWith("-->"));
    }

}