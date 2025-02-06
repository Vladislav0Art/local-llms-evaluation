package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailDoesNotThrowIOException {

    @Test
    public void outerHtmlTailDoesNotThrowIOException() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("test");
        comment.outerHtmlTail(accum, 1, out);
    }

}