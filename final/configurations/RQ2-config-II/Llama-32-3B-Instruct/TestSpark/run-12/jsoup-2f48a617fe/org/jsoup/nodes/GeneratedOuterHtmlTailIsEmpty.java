package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailIsEmpty {

    @Test
    public void outerHtmlTailIsEmpty() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = Document.OutputSettings.createEmptyDocument();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", outContent.toString());
    }

}