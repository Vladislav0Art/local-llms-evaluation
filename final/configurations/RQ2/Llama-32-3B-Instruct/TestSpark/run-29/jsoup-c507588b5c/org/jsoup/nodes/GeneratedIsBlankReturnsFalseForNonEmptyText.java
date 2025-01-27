package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.LeafNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedIsBlankReturnsFalseForNonEmptyText {

    @Test
    public void isBlankReturnsFalseForNonEmptyText() {
        TextNode node = new TextNode("Hello");
        assertFalse(node.isBlank());
    }

}