package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;

public class GeneratedTestGetWholeText {

    @Mock
    private Appendable appendable;

    @InjectMocks
    private TextNode textNode;

    @Test
    public void testGetWholeText() {
        String expected = "Hello World! This is a sample text.";
        Document document = new Document();
        document.appendChild(new TextNode("Hello World!"));
        document.appendChild(new TextNode("This is a sample text."));
        when(getWholeText()).thenReturn(expected);
        assertEquals(expected, textNode.getWholeText());
    }

}