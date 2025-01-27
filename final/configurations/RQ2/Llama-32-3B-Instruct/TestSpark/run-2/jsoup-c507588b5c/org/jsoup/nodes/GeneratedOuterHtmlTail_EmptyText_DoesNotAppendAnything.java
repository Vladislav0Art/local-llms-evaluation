package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedOuterHtmlTail_EmptyText_DoesNotAppendAnything {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void outerHtmlTail_EmptyText_DoesNotAppendAnything() {
        new TextNode("").outerHtmlTail(new StringBuilder(), 0);
        assertEquals(0, ((StringBuilder) accum).length());
    }

}