package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedIsBlank_TextIsBlank {

    @Test
    public void isBlank_TextIsBlank() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}