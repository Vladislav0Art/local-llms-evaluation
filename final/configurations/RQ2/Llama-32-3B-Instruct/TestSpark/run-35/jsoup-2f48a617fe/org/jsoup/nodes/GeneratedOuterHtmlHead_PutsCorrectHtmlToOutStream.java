package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHead_PutsCorrectHtmlToOutStream {

    @Test
    public void outerHtmlHead_PutsCorrectHtmlToOutStream() throws IOException {
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        Appendable accum = outStream;
        int depth = 0;
        Document.OutputSettings out = null; // Not used in Comment class
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!-- -->", out.toString());
    }

}