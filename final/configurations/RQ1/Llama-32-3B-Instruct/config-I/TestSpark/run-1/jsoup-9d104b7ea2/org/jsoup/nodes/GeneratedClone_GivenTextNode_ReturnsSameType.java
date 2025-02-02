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
public class GeneratedClone_GivenTextNode_ReturnsSameType {

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
    public void clone_GivenTextNode_ReturnsSameType() {
        TextNode originalTextNode = new TextNode("Hello World");
        when(parentNode.getWholeText()).thenReturn("Hello World");
        TextNode clonedTextNode = originalTextNode.clone();
        assertEquals(clonedTextNode, originalTextNode);
    }

}