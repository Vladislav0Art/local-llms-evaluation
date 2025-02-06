package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitText_WhenCalled_SplitsTextNodeAtOffset {

    @Test
    public void splitText_WhenCalled_SplitsTextNodeAtOffset() {
        TextNode textNode = new TextNode("Hello World");
        TextNode expectedChild = new TextNode("World");
        assertEquals(1, textNode.splitText(0).children().size());
        assertEquals(expectedChild, textNode.splitText(0));
    }

}