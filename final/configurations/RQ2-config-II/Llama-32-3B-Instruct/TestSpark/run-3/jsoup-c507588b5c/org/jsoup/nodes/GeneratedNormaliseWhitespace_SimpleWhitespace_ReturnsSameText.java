package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedNormaliseWhitespace_SimpleWhitespace_ReturnsSameText {

    @Mock
    private Document.OutputSettings outputSettings;

    public void setup() {
        Mockito.when(outputSettings.getIndent()).thenReturn(0);
        Mockito.when(outputSettings.getLineBreaks()).thenReturn(false);
    }

    @Test
    public void normaliseWhitespace_SimpleWhitespace_ReturnsSameText() {
        setup();
        String originalText = "   ";
        String expectedText = "   ";
        assertEquals(expectedText, TextNode.normaliseWhitespace(originalText));
    }

}