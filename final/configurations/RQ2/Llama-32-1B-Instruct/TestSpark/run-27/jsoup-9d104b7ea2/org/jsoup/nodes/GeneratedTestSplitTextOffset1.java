package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestSplitTextOffset1 {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testSplitTextOffset1() {
        String expected = "This is a sample text.";
        TextNode text = new TextNode("This is a sample text.");
        when(splitText(1)).thenReturn(text);
        assertEquals(text, textNode.splitText(1));
    }

}