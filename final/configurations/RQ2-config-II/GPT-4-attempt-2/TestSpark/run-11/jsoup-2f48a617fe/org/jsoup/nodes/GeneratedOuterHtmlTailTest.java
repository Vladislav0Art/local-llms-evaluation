package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();

        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());
    }

}