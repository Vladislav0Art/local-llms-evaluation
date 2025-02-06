package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNormaliseWhitespace_replacesTabWithSpaceTest {

    @Test
    public void normaliseWhitespace_replacesTabWithSpaceTest() {
        String text = "\tHello World";
        String expectedText = " Hello World ";
        String actualText = StringUtil.normaliseWhitespace(text);
        assertEquals(expectedText, actualText);
    }

}