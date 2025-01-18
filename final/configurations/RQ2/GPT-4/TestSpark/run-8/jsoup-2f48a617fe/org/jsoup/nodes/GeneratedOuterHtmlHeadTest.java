package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        StringBuilder accumulator = new StringBuilder();
        Comment comment = new Comment("testData");
        comment.outerHtmlHead(accumulator, 0, new Document.OutputSettings());
        Assert.assertTrue(accumulator.toString().contains("testData"));
    }

}