package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedText_EmptyText_ReturnsEmptyString {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        String result = new TextNode("").text();
        assertEquals("", result);
    }

}