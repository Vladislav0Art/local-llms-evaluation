package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = null;

        Comment comment = new Comment("Comment data");
        comment.outerHtmlHead(accum, depth, out);

        assertEquals("<!-- Comment: comment data -->", outContent.toString());
    }

}