package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTail_PutsCorrectHtmlToOutStream {

    @Test
    public void outerHtmlTail_PutsCorrectHtmlToOutStream() throws IOException {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        Appendable accum = outStream;
        int depth = 0;
        Document.OutputSettings out = null; // Not used in Comment class
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, out);
        assertEquals("", out.toString());
    }

}