package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNodeName_WhenCalled_ReturnsText {

    @Test
    public void nodeName_WhenCalled_ReturnsText() {
        TextNode textNode = new TextNode("Hello World");
        assertEquals("text", textNode.nodeName());
    }

}