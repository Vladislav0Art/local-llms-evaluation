package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedText_MultipleCharactersText_ReturnsMultipleCharactersText {

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.jsoup.nodes.TextNodeTest");
    }

    @Test
    public void text_MultipleCharactersText_ReturnsMultipleCharactersText() {
        assertEquals("hello", new TextNode("hello").text());
    }

}