package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_GivenTextNode_SplitsCorrectly {

    @Mock
    private LeafNode parentNode;

    @Mock
    private Element sibling;

    @Mock
    private Document parentDocument;

    @Mock
    private Appendable accum;

    public TextNode textNode(String text) {
        return new TextNode(text);
    }

    @Test
    public void splitText_GivenTextNode_SplitsCorrectly() throws IOException {
        TextNode textNode = textNode("Hello World!\nThis is a test.");
        int offset = 10;
        when(siblingIndex()).thenReturn(0);
        when(parentNode.getChildrenCount()).thenReturn(2);
        when(parentNode.getSibling(1)).thenReturn(textNode);

        TextNode tailNode = textNode.splitText(offset);
        assertEquals("Hello World!", tailNode.text());
    }

}