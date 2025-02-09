package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetWholeTextFromNonEmptyNode {

    @Test
    public void getWholeTextFromNonEmptyNode() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World", textNode.getWholeText());
    }

}