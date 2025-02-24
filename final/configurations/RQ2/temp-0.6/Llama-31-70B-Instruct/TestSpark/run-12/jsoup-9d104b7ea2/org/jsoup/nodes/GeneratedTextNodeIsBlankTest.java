package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTextNodeIsBlankTest {

    @Test
    public void textNodeIsBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
        textNode.text("not blank");
        assertFalse(textNode.isBlank());
    }

}