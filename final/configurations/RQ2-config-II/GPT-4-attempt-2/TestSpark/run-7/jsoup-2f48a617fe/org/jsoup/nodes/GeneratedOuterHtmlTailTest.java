package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Comment comment = new Comment("testData");
        StringBuilder accum = new StringBuilder();
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, depth, out);
        Assert.assertEquals("", accum.toString());
    }

}