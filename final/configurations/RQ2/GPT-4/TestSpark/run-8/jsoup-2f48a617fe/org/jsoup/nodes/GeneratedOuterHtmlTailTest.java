package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        StringBuilder accumulator = new StringBuilder();
        Comment comment = new Comment("testData");
        comment.outerHtmlTail(accumulator, 0, new Document.OutputSettings());
        Assert.assertEquals("", accumulator.toString());
    }

}