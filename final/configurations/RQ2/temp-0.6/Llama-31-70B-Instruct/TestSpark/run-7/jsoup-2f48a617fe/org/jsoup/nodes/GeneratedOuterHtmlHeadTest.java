package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Comment;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.jsoup.nodes.Document;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadTest {

    @Test
    public void outerHtmlHeadTest() throws IOException {
        Comment comment = new Comment("data");
        Appendable appendable = mock(Appendable.class);
        Document.OutputSettings outputSettings = mock(Document.OutputSettings.class);

        when(outputSettings.prettyPrint()).thenReturn(true);
        when(outputSettings.outline()).thenReturn(false);

        comment.outerHtmlHead(appendable, 1, outputSettings);

        verify(appendable, times(1)).append("<!--data-->");
    }

}