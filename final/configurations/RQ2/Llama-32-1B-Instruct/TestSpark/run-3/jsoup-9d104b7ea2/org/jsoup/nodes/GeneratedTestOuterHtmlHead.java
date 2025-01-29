package org.jsoup.nodes;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.when;

public class GeneratedTestOuterHtmlHead {

    private TextNode node;

    @Before
    public void setUp() {
        node = new TextNode("Hello World");
    }

    @Test
    public void testOuterHtmlHead() throws Exception {
        when(node.outerHtmlHead(any(), any(), any())).thenReturn("<div>Test</div>");
        node.outerHtmlHead(new Appendable(), 1, Document.OutputSettings.class);
        String expected = "<div>Test</div>";
        assertEquals(expected, new java.util.StringJoiner().add("Test").toString());
    }

}