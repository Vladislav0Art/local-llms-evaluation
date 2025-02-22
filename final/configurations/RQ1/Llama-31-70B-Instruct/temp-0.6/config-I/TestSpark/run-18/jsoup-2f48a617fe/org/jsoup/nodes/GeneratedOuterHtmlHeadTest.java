package org.jsoup.nodes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.Test;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws Exception {
        Comment comment = new Comment("test");
        Document document = mock(Document.class);
        when(document.outputSettings()).thenReturn(mock(Document.OutputSettings.class));
        comment.setBaseUri("https://www.example.com/");
        StringBuilder sb = new StringBuilder();
        comment.outerHtmlHead(sb, 0, mock(Document.OutputSettings.class));
        assertEquals("<!--test-->", sb.toString());
    }

}