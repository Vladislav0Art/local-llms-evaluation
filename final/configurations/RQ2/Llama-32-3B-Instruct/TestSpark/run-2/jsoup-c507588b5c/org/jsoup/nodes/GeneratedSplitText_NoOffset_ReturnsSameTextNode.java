package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedSplitText_NoOffset_ReturnsSameTextNode {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void splitText_NoOffset_ReturnsSameTextNode() {
        TextNode result = new TextNode("");
        assertEquals(result, TextNode.splitText("", 0));
    }

}