package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlTail {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testOuterHtmlTail() throws Exception {
        when(node.outerHtmlTail(any(), any(), any())).thenReturn("<div>Test</div>");
        node.outerHtmlTail(new Appendable(), 1, Document.OutputSettings.class);
        String expected = "<div>Test</div>";
        assertEquals(expected, new java.util.StringJoiner().add("Test").toString());
    }

}