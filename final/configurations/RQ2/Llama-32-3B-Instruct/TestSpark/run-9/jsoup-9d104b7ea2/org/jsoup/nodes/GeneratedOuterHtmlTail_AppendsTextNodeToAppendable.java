package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedOuterHtmlTail_AppendsTextNodeToAppendable {

    @Test
    public void outerHtmlTail_AppendsTextNodeToAppendable() throws IOException {
        Appendable accum = mock(Appendable.class);
        TextNode textNode = new TextNode("text");
        textNode.outerHtmlTail(accum);
        verify(accum).append(eq("text"));
    }

}