package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedText_GivenTextNode_SetsTextContent {

    @Test
    public void text_GivenTextNode_SetsTextContent() {
        TextNode node = new TextNode();
        node.text("New Text");
        assertEquals("New Text", node.text());
    }

}