package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedSplitText_GivenOffset WithinBounds_ReturnsCorrectTextAfterOffset {

    @Mock
    private Document document;

    @Mock
    private Appendable appendable;

    private TextNode textNode;

    public void setUp() {
        textNode = new TextNode("Hello World");
    }

    @Test
    public void splitText_GivenOffset

    WithinBounds_ReturnsCorrectTextAfterOffset() throws IOException {
        int offset = 5;
        String expectedText = "World";
        when(document.nodeType()).thenReturn(1); // 1 for TEXT_NODE

        TextNode node = new TextNode("Hello World");
        TextNode result = new TextNode("Result");

        Mockito.when(node.coreValue()).thenReturn(node.toString());
        Mockito.when(result.coreValue()).thenReturn(expectedText);

        assertEquals(result, textNode.splitText(offset));
    }

}