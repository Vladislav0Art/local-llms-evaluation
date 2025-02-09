package org.jsoup.nodes;

import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;

import javax.annotation.Nullable;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadWritesCorrectOutput {

    @Mock
    private Appendable accum;

    @Mock
    private int depth;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void outerHtmlHeadWritesCorrectOutput() throws IOException {
        when(accum.append(anyString())).thenReturn(0);
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        Comment comment = new Comment("");
        comment.outerHtmlHead(accum, depth, out);
        assertEquals(0, accum.append("><!--").indexOf("]]>"));
    }

}