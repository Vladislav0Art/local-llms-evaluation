package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedOuterHtmlTail_SkipTextForBlankOrEmpty {

    @Test
    public void outerHtmlTail_SkipTextForBlankOrEmpty() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        Appendable accum = Mockito.mock(Appendable.class);
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Document outputDocument = new Document();
        outputDocument.appendChild(textNode);
        textNode.outerHtmlTail(accum, 0, out);
        verifyNoMoreInteractions(out);
    }

}