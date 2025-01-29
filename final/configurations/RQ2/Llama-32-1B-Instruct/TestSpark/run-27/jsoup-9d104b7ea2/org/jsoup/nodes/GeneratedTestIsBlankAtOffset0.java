package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestIsBlankAtOffset0 {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testIsBlankAtOffset0() {
        String expected = true;
        Document document = new Document();
        when(isBlank()).thenReturn(expected);
        assertEquals(expected, textNode.isBlankAtOffset(0));
    }

}