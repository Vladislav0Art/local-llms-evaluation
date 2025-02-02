package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedOuterHtmlHead_PrettyPrintWithTrimming {

    @Test
    public void outerHtmlHead_PrettyPrintWithTrimming() {
        String text = "   Hello World!  ";
        TextNode textNode = new TextNode(text);
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Document outputDocument = new Document();
        outputDocument.appendChild(textNode);
        textNode.outerHtmlHead(accum, 0, out);
        verify(out).prettyPrint();
    }

}