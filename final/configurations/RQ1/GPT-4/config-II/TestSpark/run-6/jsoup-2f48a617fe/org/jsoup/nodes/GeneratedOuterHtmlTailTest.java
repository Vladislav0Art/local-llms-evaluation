package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws Exception {
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, outputSettings);
        // Expecting nothing in output as it is empty
        String result = accum.toString();
        assertTrue(result.isEmpty());
    }

}