package org.jsoup.nodes;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTestTextNode_OuterHtmlHead {

    @Test
    public void testTextNode_OuterHtmlHead() throws IOException {
        TextNode textNode = new TextNode("test");
        Appendable appendable = Mockito.mock(Appendable.class);
        when(appendable.append("test")).thenReturn(appendable);
        textNode.outerHtmlHead(appendable, 1, null);
        Mockito.verify(appendable).append("test");
    }

}