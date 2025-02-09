package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedNodeNameIsText {

    @Test
    public void nodeNameIsText() {
        TextNode textNode = new TextNode("");
        assertEquals("text", textNode.nodeName());
    }

}