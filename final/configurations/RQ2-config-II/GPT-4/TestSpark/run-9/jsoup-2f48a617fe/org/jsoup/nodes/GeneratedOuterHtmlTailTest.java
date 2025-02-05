package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        String data = "Test Comment";
        Comment comment = new Comment(data);
        StringBuilder accum = new StringBuilder();

        comment.outerHtmlTail(accum, 0, new Document.OutputSettings());

        Assert.assertEquals("", accum.toString());
    }

}