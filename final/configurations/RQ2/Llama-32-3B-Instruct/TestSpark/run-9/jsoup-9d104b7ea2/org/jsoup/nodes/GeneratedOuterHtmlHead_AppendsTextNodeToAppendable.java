package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedOuterHtmlHead_AppendsTextNodeToAppendable {

    @Test
    public void outerHtmlHead_AppendsTextNodeToAppendable() throws IOException {
        Appendable accum = mock(Appendable.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlHead(accum);
        verify(accum).append(eq("text"));
    }

}