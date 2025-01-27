package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.util.Arrays;

public class GeneratedOuterHtmlHeadComment_CallsAccumWithNodeNameAndDepthThrowsIOException {

    @Test
    public void outerHtmlHeadComment_CallsAccumWithNodeNameAndDepthThrowsIOException() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 1;
        Document.OutputSettings out = null;
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, depth, out);
        assertTrue(outContent.toString().contains("<!--"));
        assertTrue(outContent.toString().contains("-->"));
    }

}