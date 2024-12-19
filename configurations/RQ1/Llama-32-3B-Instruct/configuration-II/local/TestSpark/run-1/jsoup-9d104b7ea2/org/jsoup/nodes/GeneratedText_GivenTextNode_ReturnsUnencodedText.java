package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedText_GivenTextNode_ReturnsUnencodedText {

    @Test
    public void text_GivenTextNode_ReturnsUnencodedText() {
        TextNode textNode = new TextNode("Hello, World!");
        assert textNode.text().equals(StringUtil.normaliseWhitespace(textNode.getWholeText()));
    }

}