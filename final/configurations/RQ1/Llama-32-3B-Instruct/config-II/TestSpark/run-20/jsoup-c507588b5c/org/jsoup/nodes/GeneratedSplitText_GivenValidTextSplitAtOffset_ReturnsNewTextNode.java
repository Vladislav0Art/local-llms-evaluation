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
public class GeneratedSplitText_GivenValidTextSplitAtOffset_ReturnsNewTextNode {

    @Mock
    private Node parentNode;

    @Mock
    private Appendable accum;

    @Test
    public void splitText_GivenValidTextSplitAtOffset_ReturnsNewTextNode() throws IOException {
        String text = "Hello World";
        when(parentNode.addChildren(anyInt(), any(TextNode.class))).thenReturn(null);
        TextNode newNode = new TextNode(text);
        newNode.splitText(5);
        assertEquals("Hello", StringUtil.normaliseWhitespace(newNode.getWholeText()));
    }

}