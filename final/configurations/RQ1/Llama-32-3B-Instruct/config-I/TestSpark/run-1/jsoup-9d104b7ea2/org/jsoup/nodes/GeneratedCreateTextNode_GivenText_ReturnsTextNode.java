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
public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

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
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("#text", textNode.nodeName());
        assertEquals("Hello World", textNode.text());
    }

}