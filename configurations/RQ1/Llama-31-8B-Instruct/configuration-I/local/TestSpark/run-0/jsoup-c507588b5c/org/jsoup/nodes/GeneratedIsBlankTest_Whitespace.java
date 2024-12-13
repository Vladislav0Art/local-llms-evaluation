package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedIsBlankTest_Whitespace {

    @Test
    public void isBlankTest_Whitespace() {
        TextNode textNode = new TextNode("   ");
        assertTrue(textNode.isBlank());
    }

}