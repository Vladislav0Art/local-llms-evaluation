package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedStripLeadingWhitespace_returnsEmptyStringForEmptyInputTest {

    @Test
    public void stripLeadingWhitespace_returnsEmptyStringForEmptyInputTest() {
        String text = "";
        String expectedText = "";
        String actualText = StringUtil.stripLeadingWhitespace(text);
        assertEquals(expectedText, actualText);
    }

}