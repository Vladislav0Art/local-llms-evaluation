package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTextTest_Chaining {

    @Test
    public void textTest_Chaining() {
        TextNode textNode = new TextNode("   test   ");
        TextNode result = textNode.text("new text");
        assertEquals("new text", result.text());
    }

}