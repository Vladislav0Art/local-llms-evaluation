package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlTail {

    @Test
    public void testOuterHtmlTail() {
        Comment comment = new Comment("Test comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlTail(accum, 0, Mockito.mock(Document.OutputSettings.class));
        Assert.assertEquals("", accum.toString());
    }

}