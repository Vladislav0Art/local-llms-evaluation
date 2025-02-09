package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.SpyBean;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTailWritesCorrectOutputToAccum {

    @Mock
    private Appendable accum;

    @Mock
    private int depth;

    @Mock
    private Document.OutputSettings out;

    @SpyBean
    private Parser parser;

    @Test
    public void outerHtmlTailWritesCorrectOutputToAccum() {
        when(accum.append(anyString())).thenReturn(0);
        int depth = 1;
        Document.OutputSettings outputSettings = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlTail(accum, depth, outputSettings);
        assertEquals(0, accum.append("<!--").indexOf("-->"));
    }

}