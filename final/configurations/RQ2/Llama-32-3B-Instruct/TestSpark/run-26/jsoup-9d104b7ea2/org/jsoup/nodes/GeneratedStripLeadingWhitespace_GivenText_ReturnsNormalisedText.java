package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedStripLeadingWhitespace_GivenText_ReturnsNormalisedText {

    private TextNode textNode = new TextNode("text");

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsNormalisedText() {
        String result = TextNode.stripLeadingWhitespace("   text");
        assertEquals("text", TextNode.normaliseWhitespace(result));
    }

}