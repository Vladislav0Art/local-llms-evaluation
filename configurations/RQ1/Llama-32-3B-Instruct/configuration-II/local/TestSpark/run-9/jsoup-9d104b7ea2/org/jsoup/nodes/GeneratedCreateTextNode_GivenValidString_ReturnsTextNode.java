package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedCreateTextNode_GivenValidString_ReturnsTextNode {

    @Test
    public void createTextNode_GivenValidString_ReturnsTextNode() {
        String text = "Hello, World!";
        TextNode textNode = new TextNode(text);
        assertNotNull(textNode);
    }

}