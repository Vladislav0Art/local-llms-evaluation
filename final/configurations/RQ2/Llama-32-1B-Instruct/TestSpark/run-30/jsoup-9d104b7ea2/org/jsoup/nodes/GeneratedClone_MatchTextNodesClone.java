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
public class GeneratedClone_MatchTextNodesClone {

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
    public void clone_MatchTextNodesClone() {
        TextNode node1 = new TextNode("Hello, World!");
        TextNode node2 = node1.clone();
        assertEquals(node1, node2);
    }

}