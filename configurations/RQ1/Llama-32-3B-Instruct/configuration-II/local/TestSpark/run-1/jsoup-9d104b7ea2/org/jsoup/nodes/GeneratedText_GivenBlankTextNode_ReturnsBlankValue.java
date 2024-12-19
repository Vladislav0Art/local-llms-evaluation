package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedText_GivenBlankTextNode_ReturnsBlankValue {

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankValue() {
        TextNode textNode = new TextNode("");
        assert textNode.text().isEmpty();
    }

}