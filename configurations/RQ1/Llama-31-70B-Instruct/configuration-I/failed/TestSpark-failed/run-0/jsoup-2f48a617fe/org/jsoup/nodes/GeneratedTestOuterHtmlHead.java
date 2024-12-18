package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.LeafNode;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedTestOuterHtmlHead {

    private Comment comment;

    @Before
    public void setUp() {
        comment = new Comment("test");
    }

    @Test
    public void testOuterHtmlHead() {
        StringBuilder accum = new StringBuilder();
        comment.outerHtmlHead(accum, 0, Mockito.mock(Document.OutputSettings.class));
        assertEquals("<!--test-->", accum.toString());
    }

}