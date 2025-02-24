package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.TextNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private TextNode textNode;

    @Test
    public void textNodeTextTest() {
        Mockito.when(textNode.text()).thenReturn("Text");
        assertEquals("Text", textNode.text());
    }

    @Test
    public void textNodeNodeNameTest() {
        Mockito.when(textNode.nodeName()).thenReturn("#text");
        assertEquals("#text", textNode.nodeName());
    }

    @Test
    public void textNodeBlankTest() {
        Mockito.when(textNode.isBlank()).thenReturn(true);
        assertTrue(textNode.isBlank());
    }

    @Test
    public void textNodeTextSetterTest() {
        Mockito.when(textNode.text(Mockito.anyString())).thenReturn(textNode);
        assertEquals(textNode, textNode.text("Text"));
    }

    @Test
    public void textNodeGetWholeTextTest() {
        Mockito.when(textNode.getWholeText()).thenReturn("Whole Text");
        assertEquals("Whole Text", textNode.getWholeText());
    }

    @Test
    public void textNodeSplitTextTest() {
        Mockito.when(textNode.splitText(Mockito.anyInt())).thenReturn(textNode);
        assertEquals(textNode, textNode.splitText(1));
    }

}