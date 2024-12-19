package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

public class GeneratedIsBlank_GivenTextNodeReturnsTrueIfBlank {

    @Test
    public void isBlank_GivenTextNodeReturnsTrueIfBlank() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
    }

}