package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlHead(accum, 0, out);
        Assert.assertTrue(accum.toString().contains("<!--testData-->"));
    }

}