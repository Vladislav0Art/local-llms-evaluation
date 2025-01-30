package org.jsoup.nodes;

import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() throws IOException {
        Document.OutputSettings mockOutputSettings = mock(Document.OutputSettings.class);
        when(mockOutputSettings.prettyPrint()).thenReturn(true);
        when(mockOutputSettings.outline()).thenReturn(false);
        StringBuilder accum = new StringBuilder();
        int depth = 0;

        Comment comment = new Comment("data");
        comment.outerHtmlTail(accum, depth, mockOutputSettings);

        Assert.assertEquals("", accum.toString());
    }

}