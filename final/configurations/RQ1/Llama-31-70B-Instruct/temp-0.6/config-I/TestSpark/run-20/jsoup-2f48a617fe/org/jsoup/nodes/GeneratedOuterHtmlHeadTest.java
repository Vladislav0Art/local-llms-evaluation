package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() {
        Comment comment = new Comment("Hello World");
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("<!--Hello World-->", accum.toString());
    }

}