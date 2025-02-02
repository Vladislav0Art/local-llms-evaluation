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

public class GeneratedText_GivenBlankTextNode_ReturnsBlankString {

    @Test
    public void text_GivenBlankTextNode_ReturnsBlankString() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.text().isEmpty());
    }

}