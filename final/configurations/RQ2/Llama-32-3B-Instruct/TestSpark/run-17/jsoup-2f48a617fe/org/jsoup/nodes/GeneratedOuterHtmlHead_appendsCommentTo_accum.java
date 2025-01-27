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
public class GeneratedOuterHtmlHead_appendsCommentTo_accum {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Mock
    private Parser parser;

    @Test
    public void outerHtmlHead_appendsCommentTo_accum() throws Exception {
        Comment comment = Comment.create("data");
        accum.append("");
        when(out.accum).thenReturn(accum);
        comment.outerHtmlHead(out, 0, parser);
        assertEquals("<!-- data -->", accum.toString());
    }

}