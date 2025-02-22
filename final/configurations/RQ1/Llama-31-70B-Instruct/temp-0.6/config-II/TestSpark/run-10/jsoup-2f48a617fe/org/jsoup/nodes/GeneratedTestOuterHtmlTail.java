package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() throws IOException {
        Comment comment = new Comment("Hello, World!");
        StringBuilder builder = new StringBuilder();
        comment.outerHtmlTail(builder, 0, new Document().outputSettings());
        assertEquals("", builder.toString());
    }

}