package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedCreateTextNode_GivenText_ReturnsTextNode {

    @Test
    public void createTextNode_GivenText_ReturnsTextNode() {
        TextNode textNode = new TextNode("Hello World");
        assertNotNull(textNode);
    }

}