package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment commentNode = new Comment("test");
        StringBuilder accum = new StringBuilder();
        commentNode.outerHtmlHead(accum, 0, new Document.OutputSettings().prettyPrint(true));
        assertEquals("<!--test-->", accum.toString());
    }

}