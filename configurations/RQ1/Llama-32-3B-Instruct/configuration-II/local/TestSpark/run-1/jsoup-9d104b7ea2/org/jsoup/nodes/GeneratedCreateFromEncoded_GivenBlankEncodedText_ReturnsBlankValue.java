package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncoded_GivenBlankEncodedText_ReturnsBlankValue {

    @Test
    public void createFromEncoded_GivenBlankEncodedText_ReturnsBlankValue() {
        String encodedText = "";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertTrue(textNode.isBlank());
    }

}