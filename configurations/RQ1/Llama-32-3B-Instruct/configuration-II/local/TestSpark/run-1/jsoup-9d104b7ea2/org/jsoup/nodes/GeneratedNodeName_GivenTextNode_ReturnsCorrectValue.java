package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNodeName_GivenTextNode_ReturnsCorrectValue {

    @Test
    public void nodeName_GivenTextNode_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("");
        assert textNode.nodeName().equals("#text");
    }

}