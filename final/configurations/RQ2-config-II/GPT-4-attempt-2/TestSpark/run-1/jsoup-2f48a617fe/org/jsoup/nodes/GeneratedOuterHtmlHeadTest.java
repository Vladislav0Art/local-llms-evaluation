package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.LeafNode;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("test_data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, new Document.OutputSettings());
        assertEquals("<!--test_data-->", accum.toString());
    }

}