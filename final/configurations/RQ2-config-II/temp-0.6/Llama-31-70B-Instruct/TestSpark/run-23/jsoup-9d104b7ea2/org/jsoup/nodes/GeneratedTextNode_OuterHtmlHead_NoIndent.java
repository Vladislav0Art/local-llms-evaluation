package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTextNode_OuterHtmlHead_NoIndent {

    @Test
    public void textNode_OuterHtmlHead_NoIndent() throws IOException {
        TextNode textNode = new TextNode("Hello World");
        Appendable accum = mock(Appendable.class);
        doNothing().when(accum).append("Hello World");
        textNode.outerHtmlHead(accum, 0, Document.OutputSettings.create().prettyPrint(false));
        verify(accum).append("Hello World");
    }

}