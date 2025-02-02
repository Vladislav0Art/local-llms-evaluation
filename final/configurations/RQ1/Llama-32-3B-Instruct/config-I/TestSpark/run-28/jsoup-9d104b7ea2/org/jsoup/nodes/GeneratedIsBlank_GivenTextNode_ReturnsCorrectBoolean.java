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

public class GeneratedIsBlank_GivenTextNode_ReturnsCorrectBoolean {

    @Test
    public void isBlank_GivenTextNode_ReturnsCorrectBoolean() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
        text = "";
        textNode = new TextNode(text);
        assertTrue(textNode.isBlank());
    }

}