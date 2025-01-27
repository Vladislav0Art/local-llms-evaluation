package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedNewNodeTextTrimmingTest {

    @Test
    public void newNodeTextTrimmingTest() {
        String text = "   Hello World  ";
        TextNode textNode = new TextNode(text);
        assertEquals(11, textNode.text().length());
    }

}