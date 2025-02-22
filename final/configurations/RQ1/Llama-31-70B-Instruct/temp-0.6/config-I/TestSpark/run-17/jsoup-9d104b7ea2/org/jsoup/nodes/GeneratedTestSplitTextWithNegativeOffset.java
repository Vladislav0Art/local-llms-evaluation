package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.mockito.ArgumentMatchers.anyString;

public class GeneratedTestSplitTextWithNegativeOffset {

    @Test
    public void testSplitTextWithNegativeOffset() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(-1);
    }

}