package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedCloneNode_NewNodeHasSameText {

    @Mock
    private Document.OutputSettings outputSettings;

    public void setup() {
        Mockito.when(outputSettings.getIndent()).thenReturn(0);
        Mockito.when(outputSettings.getLineBreaks()).thenReturn(false);
    }

    @Test
    public void cloneNode_NewNodeHasSameText() {
        setup();
        TextNode originalNode = new TextNode("Hello World");
        TextNode clonedNode = originalNode.clone();
        assertEquals(originalNode.text(), clonedNode.text());
    }

}