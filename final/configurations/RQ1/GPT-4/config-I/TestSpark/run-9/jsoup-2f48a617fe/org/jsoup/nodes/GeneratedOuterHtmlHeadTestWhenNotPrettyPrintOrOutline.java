package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;

import static org.junit.Assert.*;

import org.junit.Test;

public class GeneratedOuterHtmlHeadTestWhenNotPrettyPrintOrOutline {

    @Test
    public void outerHtmlHeadTestWhenNotPrettyPrintOrOutline() {
        Comment comment = new Comment("Test");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!--Test-->", accum.toString());
    }

}