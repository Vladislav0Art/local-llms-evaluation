package org.jsoup.nodes;

import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadValidScenario {

    @Test
    public void outerHtmlHeadValidScenario() throws IOException {
        Comment comment = new Comment("Test Comment");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document("").outputSettings();
        comment.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("Test Comment"));
    }

}