package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedIsBlank_NonBlankText {

    @Test
    public void isBlank_NonBlankText() {
        TextNode node = new TextNode("Hello World");
        assertFalse(node.isBlank());
    }

}