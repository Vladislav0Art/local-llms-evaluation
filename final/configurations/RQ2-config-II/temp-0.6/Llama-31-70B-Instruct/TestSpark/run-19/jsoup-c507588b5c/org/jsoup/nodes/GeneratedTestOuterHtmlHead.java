package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestOuterHtmlHead {

    @Test
    public void testOuterHtmlHead() throws Exception {
        TextNode textNode = new TextNode("test");
        Document.OutputSettings out = Mockito.mock(Document.OutputSettings.class);
        Mockito.when(out.prettyPrint()).thenReturn(true);

        Appendable accum = Mockito.mock(Appendable.class);
        textNode.outerHtmlHead(accum, 0, out);

        Mockito.verify(accum).append("test");
    }

}