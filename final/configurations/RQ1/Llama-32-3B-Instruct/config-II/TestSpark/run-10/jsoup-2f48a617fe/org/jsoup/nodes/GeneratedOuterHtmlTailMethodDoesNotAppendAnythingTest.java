package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailMethodDoesNotAppendAnythingTest {

    @Test
    public void outerHtmlTailMethodDoesNotAppendAnythingTest() throws IOException {
        Comment comment = new Comment("");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        Document.OutputSettings out = new Document.OutputSettings(true);
        comment.outerHtmlHead(accum, 0, out);
        String output = outContent.toString();
        assertFalse(output.contains("<!--"));
    }

}