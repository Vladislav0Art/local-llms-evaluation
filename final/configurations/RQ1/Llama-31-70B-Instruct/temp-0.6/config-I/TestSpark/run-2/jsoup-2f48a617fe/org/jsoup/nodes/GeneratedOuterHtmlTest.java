package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class GeneratedOuterHtmlTest {

    @Test
    public void outerHtmlTest() {
        Comment comment = new Comment("test");

        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, Mockito.mock(Document.OutputSettings.class));
        comment.outerHtmlTail(sb, 0, Mockito.mock(Document.OutputSettings.class));

        assertEquals("<!--test-->", sb.toString());
    }

}