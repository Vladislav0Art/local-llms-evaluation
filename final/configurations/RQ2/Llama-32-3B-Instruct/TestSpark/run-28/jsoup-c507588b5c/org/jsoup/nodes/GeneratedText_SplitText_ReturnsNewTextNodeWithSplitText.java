package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_SplitText_ReturnsNewTextNodeWithSplitText {

    @Test
    public void text_SplitText_ReturnsNewTextNodeWithSplitText() {
        TextNode originalTextNode = new TextNode("Original text");
        TextNode newTextNode = originalTextNode.splitText(6);
        assertNotNull(newTextNode.text());
        assertTrue(!newTextNode.text().equals(originalTextNode.text()));
    }

}