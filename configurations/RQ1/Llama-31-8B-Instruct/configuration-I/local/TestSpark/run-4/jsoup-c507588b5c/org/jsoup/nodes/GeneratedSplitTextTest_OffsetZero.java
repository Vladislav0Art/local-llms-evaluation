package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

@RunWith(JUnit4.class)
public class GeneratedSplitTextTest_OffsetZero {

    @Test
    public void splitTextTest_OffsetZero() {
        TextNode textNode = new TextNode("test");
        TextNode result = textNode.splitText(0);
        assertEquals("", result.text());
        assertEquals("test", textNode.text());
    }

}