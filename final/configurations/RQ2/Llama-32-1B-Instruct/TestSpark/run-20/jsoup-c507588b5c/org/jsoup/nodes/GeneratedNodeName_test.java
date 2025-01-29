package org.jsoup.nodes;

import org.junit.jupiter.api.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

public class GeneratedNodeName_test {

    @Test
    public void nodeName_test() {
        TextNode node = new TextNode("Hello World");
        assertEquals("text", node.nodeName());
    }

}