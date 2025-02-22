package org.jsoup.nodes;

import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Token;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestNodeName {

    @Test
    public void testNodeName() {
        TextNode textNode = new TextNode("test");
        assertEquals("#text", textNode.nodeName());
    }

}