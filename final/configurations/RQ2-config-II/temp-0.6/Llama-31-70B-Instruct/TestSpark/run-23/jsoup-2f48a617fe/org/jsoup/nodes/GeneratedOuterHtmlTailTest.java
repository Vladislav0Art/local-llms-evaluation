package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;

import java.io.IOException;
import java.io.StringWriter;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("data");
        StringWriter stringWriter = new StringWriter();
        comment.outerHtmlTail(stringWriter, 0, new Document.OutputSettings());
        assertEquals("", stringWriter.toString());
    }

}