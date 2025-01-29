package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtmlTail_MatchTextNodesOuterHtmlTail {

    @InjectMocks
    private TextNode textNode;

    @Mock
    private Appendable parent;

    @Mock
    private Document document;

    @Before
    public void setUp() {
        when(document.getHtml()).thenReturn("Hello, World!");
        when(parent.toString()).thenReturn("");
        when(document.OutputSettings().hasHTML()).thenReturn(true);
    }

    @Test
    public void outerHtmlTail_MatchTextNodesOuterHtmlTail() {
        int depth = 1;
        Document.OutputSettings out = new Document.OutputSettings();
        when(document.OutputSettings().hasHTML()).thenReturn(true);
        when(parent.toString()).thenReturn("Hello, World!");
        when(document.getHtml()).thenReturn("");
        when(out.hasHTML()).thenReturn(true);

        TextNode node = new TextNode("Hello, World!");
        assertEquals("<p>Hello, World!</p>", node.outerHtmlTail(parent, depth, out));
    }

}