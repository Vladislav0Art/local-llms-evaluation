package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedSplitText_ValidOffset_SplitsCorrectly {

    @Mock
    private Document.OutputSettings outputSettings;

    public void setup() {
        Mockito.when(outputSettings.getIndent()).thenReturn(0);
        Mockito.when(outputSettings.getLineBreaks()).thenReturn(false);
    }

    @Test
    public void splitText_ValidOffset_SplitsCorrectly() {
        setup();
        String text = "Hello World";
        int offset = 5;
        TextNode splitTextNode = new TextNode(text).splitText(offset);
        assertEquals("World", splitTextNode.text());
    }

}