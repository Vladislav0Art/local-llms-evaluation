package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestIsBlank {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testIsBlank() {
        String expected = true;
        Document document = new Document();
        document.appendChild(new TextNode(""));
        when(isBlank()).thenReturn(expected);
        assertEquals(expected, textNode.isBlank());
    }

}