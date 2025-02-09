package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedOuterHtmlHeadAndTailTest {

    @Test
    public void outerHtmlHeadAndTailTest() throws IOException {
        TextNode node = new TextNode("hello");
        StringBuilder sb = new StringBuilder();
        Document.OutputSettings mockSettings = mock(Document.OutputSettings.class);

        node.outerHtmlHead(sb, 0, mockSettings);
        node.outerHtmlTail(sb, 0, mockSettings);
        assertEquals("hello", sb.toString());
    }

}