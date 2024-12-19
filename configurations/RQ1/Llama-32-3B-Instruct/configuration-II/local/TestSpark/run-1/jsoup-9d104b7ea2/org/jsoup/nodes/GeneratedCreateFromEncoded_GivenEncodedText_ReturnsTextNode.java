package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncoded_GivenEncodedText_ReturnsTextNode {

    @Test
    public void createFromEncoded_GivenEncodedText_ReturnsTextNode() {
        String encodedText = "&lt;Hello, World!&gt;";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assert textNode != null;
    }

}