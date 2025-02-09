package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTextNodeNonEmptyText {

    @Test
    public void createTextNodeNonEmptyText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.text());
    }

}