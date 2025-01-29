package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestIsBlankAtOffset1 {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testIsBlankAtOffset1() {
        String expected = false;
        Document document = new Document();
        when(isBlank()).thenReturn(expected);
        assertEquals(expected, textNode.isBlankAtOffset(1));
    }

}