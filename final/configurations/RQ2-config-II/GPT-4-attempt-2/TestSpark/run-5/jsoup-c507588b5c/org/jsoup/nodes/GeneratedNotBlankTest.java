package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNotBlankTest {

    @Test
    public void notBlankTest() {
        TextNode textNode = new TextNode("Not blank");

        assertFalse(textNode.isBlank());
    }

}