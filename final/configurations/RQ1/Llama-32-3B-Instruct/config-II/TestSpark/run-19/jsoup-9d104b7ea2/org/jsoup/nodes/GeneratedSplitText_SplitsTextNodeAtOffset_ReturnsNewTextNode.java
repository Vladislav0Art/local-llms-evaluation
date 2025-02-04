package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;
import java.util.List;

public class GeneratedSplitText_SplitsTextNodeAtOffset_ReturnsNewTextNode {

    @Test
    public void splitText_SplitsTextNodeAtOffset_ReturnsNewTextNode() {
        String text = "Hello\nWorld!";
        int offset = 6;
        TextNode node = new TextNode(text);
        TextNode tailNode = node.splitText(offset);
        assertNotNull(tailNode.value());
        assertEquals("World!", StringUtil.normaliseWhitespace(tailNode.text()));
    }

}