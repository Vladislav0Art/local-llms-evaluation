package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlHead(accum, depth, out);
        Assert.assertTrue(accum.toString().startsWith("<!--"));
    }

}