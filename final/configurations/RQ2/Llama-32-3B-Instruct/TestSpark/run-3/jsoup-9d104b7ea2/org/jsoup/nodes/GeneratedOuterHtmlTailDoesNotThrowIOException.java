package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedOuterHtmlTailDoesNotThrowIOException {

    @Test
    public void outerHtmlTailDoesNotThrowIOException() throws IOException {
        Appendable accum = mock(Appendable.class);
        Document.OutputSettings out = mock(Document.OutputSettings.class);
        TextNode node = new TextNode("Hello");
        Node outerNode = mock(Node.class);
        LeafNode leafNode = mock(LeafNode.class);
        when(node.outerHtmlTail(accum, 1, out)).thenReturn(leafNode);
        Node result = new LeafNode().outerHtmlTail(accum, 0, out);
        verify(leafNode).outerHtmlTail(accum, 1, out);
    }
}

}