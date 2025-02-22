package org.jsoup.nodes;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws IOException {
        Comment comment = new Comment("Test comment");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Mockito.mock(Document.OutputSettings.class));
        Assert.assertEquals("<!--Test comment-->", accum.toString());
    }

}