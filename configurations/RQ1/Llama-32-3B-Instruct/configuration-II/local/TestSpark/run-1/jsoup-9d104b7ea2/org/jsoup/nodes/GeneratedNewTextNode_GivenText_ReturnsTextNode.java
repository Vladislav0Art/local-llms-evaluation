package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNewTextNode_GivenText_ReturnsTextNode {

    @Test
    public void newTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello, World!");
        assert textNode != null;
    }

}