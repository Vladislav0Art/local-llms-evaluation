package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GeneratedBlank_node {

    @Test
    public void blank_node() {
        TextNode node = new TextNode("");
        assertTrue(node.isBlank());
    }

}