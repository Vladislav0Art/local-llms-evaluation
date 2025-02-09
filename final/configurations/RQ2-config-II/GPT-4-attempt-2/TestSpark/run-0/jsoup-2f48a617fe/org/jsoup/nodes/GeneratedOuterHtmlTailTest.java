package org.jsoup.nodes;

import org.junit.Test;
import org.junit.Assert;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        Comment comment = new Comment("test");
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        comment.outerHtmlTail(accum, 0, out);
        Assert.assertEquals("", accum.toString());  // Comment node has no tail
    }

}