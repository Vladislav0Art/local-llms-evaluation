package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedText_GivenTextNodeWithSpaces_ReturnsCorrectValue {

    @Test
    public void text_GivenTextNodeWithSpaces_ReturnsCorrectValue() {
        TextNode textNode = new TextNode("   ");
        assert textNode.text().equals(StringUtil.normaliseWhitespace(textNode.getWholeText()));
    }

}