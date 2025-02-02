package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayBuilder;
import java.util.ArrayList;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.mockito.Mockito;

public class GeneratedText_GivenTextNode_ReturnsCorrectText {

    @Test
    public void text_GivenTextNode_ReturnsCorrectText() {
        String text = "Hello World";
        TextNode textNode = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace("Hello World"), textNode.text());
    }

}