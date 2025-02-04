package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedText_GivenValidText_ReturnsUnescapedText {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void text_GivenValidText_ReturnsUnescapedText() {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        newNode.text(" ");
        assertEquals("Hello World", StringUtil.normaliseWhitespace(newNode.getWholeText()));
    }

}