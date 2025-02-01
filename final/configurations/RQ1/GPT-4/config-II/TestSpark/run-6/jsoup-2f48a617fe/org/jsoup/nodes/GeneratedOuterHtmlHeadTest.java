package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        outputSettings.prettyPrint(true);
        outputSettings.outline(true);
        Comment comment = new Comment("data");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, outputSettings);
        String result = accum.toString();
        assertTrue(result.contains("<!--"));
        assertTrue(result.contains("data"));
        assertTrue(result.contains("-->"));
    }

}