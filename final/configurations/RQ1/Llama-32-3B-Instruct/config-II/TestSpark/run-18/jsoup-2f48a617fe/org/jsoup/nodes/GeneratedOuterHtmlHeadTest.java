package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.io.ByteArrayOutputStream;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void OuterHtmlHeadTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        Appendable accum = outContent;
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("<!-- test -->");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals("<!--test-->", outContent.toString());
    }

}