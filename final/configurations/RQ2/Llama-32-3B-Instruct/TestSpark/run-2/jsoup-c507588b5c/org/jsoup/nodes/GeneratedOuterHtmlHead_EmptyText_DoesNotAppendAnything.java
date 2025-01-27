package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedOuterHtmlHead_EmptyText_DoesNotAppendAnything {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void outerHtmlHead_EmptyText_DoesNotAppendAnything() throws IOException {
        new TextNode("").outerHtmlHead(new StringBuilder(), 0);
        assertEquals(0, ((StringBuilder) accum).length());
    }

}