package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Appendable accum = new ByteArrayOutputStream();
        int depth = 0;
        Document.OutputSettings out = null;

        Comment comment = new Comment("Comment data");
        comment.outerHtmlTail(accum, depth, out);

        assertEquals("\n<!-- Comment: comment data -->", accum.toString());
    }

}