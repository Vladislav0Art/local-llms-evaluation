package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_doesNotAppendAnything {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Parser parser;

    @Test
    public void outerHtmlTail_doesNotAppendAnything() throws Exception {
        Comment comment = Comment.create("");
        accum.append("");
        when(out.accum).thenReturn(accum);
        comment.outerHtmlTail(out, 0, parser);
        assertEquals("", accum.toString());
    }

}