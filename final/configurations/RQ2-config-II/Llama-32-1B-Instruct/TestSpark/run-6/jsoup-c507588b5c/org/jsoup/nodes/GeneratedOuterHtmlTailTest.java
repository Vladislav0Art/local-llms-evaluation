package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.TextNode;
import org.mockito.Mockito;

public class GeneratedOuterHtmlTailTest {

    @Test
    public void outerHtmlTailTest() {
        // No mock needed for this method
        String text = "Hello World";
        TextNode node = new TextNode(text);
        node.outerHtmlTail(Mockito.mock(Appendable.class), 0, Mockito.mock(Document.OutputSettings.class));
    }

}