package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedSplitTextTest_OffsetEnd {

    @Test
    public void splitTextTest_OffsetEnd() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(4);
        assertEquals("", result.text());
        assertEquals("test", textNode.text());
    }

}