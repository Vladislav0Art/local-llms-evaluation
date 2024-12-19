package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlank_GivenTextNodeWithSpaces_ReturnsFalse {

    @Test
    public void isBlank_GivenTextNodeWithSpaces_ReturnsFalse() {
        TextNode textNode = new TextNode("   ");
        assertFalse(textNode.isBlank());
    }

}