package org.jsoup.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        // mock Appendable and Document.OutputSettings
        MockAppendable app = mock(Appendable.class);
        Mockito.when(app.toString()).thenReturn("");
        MockDocument.OutputSettings out = mock(Document.OutputSettings.class);
        when(out.getIndent()).thenReturn("  ", "    ");
        when(out.getMarginLeft()).thenReturn(0, 5);
        TextNode result = node.outerHtmlHead(app, 1, out);
        assertEquals("", result.toString());
    }

}