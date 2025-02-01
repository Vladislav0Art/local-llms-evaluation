package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment commentNode = new Comment("test");
        StringBuilder accum = new StringBuilder();
        commentNode.outerHtmlTail(accum, 0, new Document.OutputSettings());
        assertEquals("", accum.toString());
    }

}