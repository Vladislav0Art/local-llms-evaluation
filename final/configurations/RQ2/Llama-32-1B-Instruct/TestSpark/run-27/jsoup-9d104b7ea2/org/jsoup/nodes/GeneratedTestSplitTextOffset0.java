package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestSplitTextOffset0 {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testSplitTextOffset0() {
        String expected = "Hello World!";
        TextNode text = new TextNode("Hello World!");
        when(splitText(0)).thenReturn(text);
        assertEquals(text, textNode.splitText(0));
    }

}