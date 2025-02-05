package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("Test data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Parser.unescapeEntities("Test data", true));
        assertTrue(accum.toString().contains("Test data"));
    }

}