package org.jsoup.nodes;

import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedShouldWriteOuterHtml {

    private Comment comment;

    @Test
    public void shouldWriteOuterHtml() throws IOException {
        comment = new Comment("Test");
        StringWriter writer = new StringWriter();
        comment.outerHtmlHead(writer, 0, new Document.OutputSettings());
        assertEquals("<!--Test-->", writer.toString());
    }

}