package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadCommentTest_ThrowsIOException {

    @Test
    public void outerHtmlHeadCommentTest_ThrowsIOException() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
    }

}