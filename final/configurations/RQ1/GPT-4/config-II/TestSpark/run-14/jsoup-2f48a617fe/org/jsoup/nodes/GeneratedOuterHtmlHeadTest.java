package org.jsoup.nodes;

import org.jsoup.parser.Tag;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Document.OutputSettings mockSettings = mock(Document.OutputSettings.class);
        when(mockSettings.prettyPrint()).thenReturn(true);
        Element parent = new Element(Tag.valueOf("div"), "");
        StringBuilder accum = new StringBuilder();

        Comment comment = new Comment("test");
        parent.appendChild(comment);

        comment.outerHtmlHead(accum, 0, mockSettings);
        Assert.assertEquals("<!--test-->", accum.toString());
    }

}