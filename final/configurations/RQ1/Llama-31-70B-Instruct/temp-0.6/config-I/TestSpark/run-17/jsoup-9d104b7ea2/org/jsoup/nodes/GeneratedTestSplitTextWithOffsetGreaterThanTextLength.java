package org.jsoup.nodes;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.jsoup.nodes.TextNode;

import static org.mockito.ArgumentMatchers.anyString;

public class GeneratedTestSplitTextWithOffsetGreaterThanTextLength {

    @Test
    public void testSplitTextWithOffsetGreaterThanTextLength() {
        TextNode textNode = new TextNode("test");
        textNode.splitText(5);
    }

}