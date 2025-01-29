package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.verify;

public class GeneratedTestSplitText {

    @Test
    public void testSplitText() throws Exception {
        TextNode node = new TextNode("Hello World");
        String expected = "Hello\nWorld";
        verify(node).splitText(0).getWholeText().thenReturn(expected);
        assertSame(expected, node.getWholeText());
    }

}