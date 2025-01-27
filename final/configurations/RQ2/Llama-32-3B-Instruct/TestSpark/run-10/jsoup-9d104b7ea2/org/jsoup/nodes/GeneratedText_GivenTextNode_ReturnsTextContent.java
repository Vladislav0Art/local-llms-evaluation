package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedText_GivenTextNode_ReturnsTextContent {

    @Test
    public void text_GivenTextNode_ReturnsTextContent() {
        TextNode node = new TextNode("Hello World");
        assertEquals("Hello World", node.text());
    }

}