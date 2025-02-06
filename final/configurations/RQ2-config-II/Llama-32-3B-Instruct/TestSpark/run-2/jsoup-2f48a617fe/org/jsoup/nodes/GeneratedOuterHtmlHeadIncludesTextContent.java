package org.jsoup.nodes;

import org.jsoup.nodes.Comment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlHeadIncludesTextContent {

    @Mock
    private Appendable accum;

    @Mock
    private Document.OutputSettings out;

    @Test
    public void outerHtmlHeadIncludesTextContent() throws IOException {
        when(accum.append(anyString())).thenReturn(accum);
        Comment comment = new Comment("data");
        comment.outerHtmlHead(accum, 0, out);
        assertEquals("<!-- data -->", accum.toString());
    }

}