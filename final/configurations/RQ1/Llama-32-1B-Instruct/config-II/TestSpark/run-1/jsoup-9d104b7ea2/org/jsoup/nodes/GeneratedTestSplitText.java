package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Random;

public class GeneratedTestSplitText {

    private TextNode node;

    @Before
    public void setup() {
        Random random = new Random();
        node = new TextNode(StringUtil.randomString(10, 100));
    }

    @Test
    public void testSplitText() {
        int offset = 10;
        TextNode result = node.splitText(offset);
        assertNotNull(result);
        assertTrue(result.isBlank());
        assertEquals(5, result.getWholeText().length());
    }

}