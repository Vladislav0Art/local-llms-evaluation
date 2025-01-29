package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestToString {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testToString() {
        String expected = "Hello World!";
        when(appendable.toString()).thenReturn(expected);
        assertEquals(expected, textNode.toString());
    }

}