package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedTest {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void text_EmptyText_ReturnsEmptyString() {
        String result = new TextNode("").text();
        assertEquals("", result);
    }

    @Test
    public void text_SingleCharacterText_ReturnsSingleCharacterText() {
        assertEquals("a", new TextNode("a").text());
    }

    @Test
    public void text_MultipleCharactersText_ReturnsMultipleCharactersText() {
        assertEquals("hello", new TextNode("hello").text());
    }

}