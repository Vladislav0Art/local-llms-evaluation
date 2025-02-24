package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedConstructTextNodeTest {

    @Mock
    private TextNode textNode;

    @Mock
    private LeafNode leafNode;

    @Mock
    private Document document;

    @Test
    public void constructTextNodeTest() {
        when(textNode.nodeName()).thenReturn("TextNode");
        when(textNode.text()).thenReturn("Text");
        when(textNode.getWholeText()).thenReturn("WholeText");
        assertEquals(textNode.nodeName(), "TextNode");
        assertEquals(textNode.text(), "Text");
        assertEquals(textNode.getWholeText(), "WholeText");
    }

}