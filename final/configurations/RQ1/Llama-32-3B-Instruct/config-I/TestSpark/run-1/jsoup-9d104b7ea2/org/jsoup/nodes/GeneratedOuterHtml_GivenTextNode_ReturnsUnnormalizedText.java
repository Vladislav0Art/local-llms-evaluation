package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedOuterHtml_GivenTextNode_ReturnsUnnormalizedText {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Document parent;

    @Mock
    private Appendable appendable;

    @Before
    public void setup() {
        when(parentNode.addChildren(0, this)).thenReturn(this);
        when(parent.addNode(this)).thenReturn(this);
    }

    @Test
    public void outerHtml_GivenTextNode_ReturnsUnnormalizedText() {
        String expectedOuterHtml = "<span>Hello World</span>";
        when(parentNode.getWholeText()).thenReturn("Hello World");
        TextNode textNode = new TextNode("Hello World");
        assertEquals(expectedOuterHtml, textNode.toString());
    }

}