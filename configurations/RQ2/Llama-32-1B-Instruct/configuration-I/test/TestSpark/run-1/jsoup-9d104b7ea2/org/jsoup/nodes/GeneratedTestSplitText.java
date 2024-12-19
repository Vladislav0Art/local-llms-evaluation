package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        when(getSplitText(0, node)).thenReturn(new StringBuffer());
        assertEquals("HelloWorld", getNodeWholeText(node).toString());
    }

}