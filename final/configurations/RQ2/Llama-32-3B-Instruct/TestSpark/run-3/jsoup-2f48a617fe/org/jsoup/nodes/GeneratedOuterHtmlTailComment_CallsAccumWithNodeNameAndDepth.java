package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.jsoup.parser.ParseSettings;

import javax.annotation.Nullable;
import java.util.Arrays;

public class GeneratedOuterHtmlTailComment_CallsAccumWithNodeNameAndDepth {

    @Test
    public void outerHtmlTailComment_CallsAccumWithNodeNameAndDepth() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 1;
        Document.OutputSettings out = null;
        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, out);
        assertTrue(outContent.toString().contains("<!--"));
    }

}