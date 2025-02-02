package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedOuterHtmlHead_MocksOuterHtmlMethodToReturnStringValue {

    @Test
    public void OuterHtmlHead_MocksOuterHtmlMethodToReturnStringValue() {
        Appendable accum = Mockito.mock(Appendable.class);
        int depth = 0;
        Document.OutputSettings out = new Document.OutputSettings();
        TextNode textNode = new TextNode("Test");
        String expectedHtml = "<span>Test</span>";
        when(accum.append(any(), any())).thenReturn(expectedHtml);

        String html = textNode.outerHtmlHead(accum, depth, out);
        assertEquals(expectedHtml, html);
    }

}