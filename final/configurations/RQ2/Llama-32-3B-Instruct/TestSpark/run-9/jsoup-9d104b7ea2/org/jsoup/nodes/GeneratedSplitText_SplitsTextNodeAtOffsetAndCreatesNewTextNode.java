package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.io.IOException;

public class GeneratedSplitText_SplitsTextNodeAtOffsetAndCreatesNewTextNode {

    @Test
    public void splitText_SplitsTextNodeAtOffsetAndCreatesNewTextNode() {
        TextNode textNode = new TextNode("text");
        TextNode newNode = textNode.splitText(3);
        assertEquals(4, newNode.text().length());
    }

}