package org.jsoup.nodes;

import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedOuterHtmlHead_GivenDocumentSettings_ReturnsCorrectOuterHTML {

    @Test
    public void outerHtmlHead_GivenDocumentSettings_ReturnsCorrectOuterHTML() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        Document.OutputSettings outSettings = new Document.OutputSettings();
        Appendable accum = mock(Appendable.class);
        int depth = 0;
        Document document = mock(Document.class);
        when(document.parentNode).thenReturn(document);
        textNode.outerHtmlHead(accum, depth, outSettings);
        String outerHTML = accum.toString();
        assertNotNull(outerHTML);
    }

}