package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedText_SetsTextContent_GivenTextNode {

    @Test
    public void text_SetsTextContent_GivenTextNode() {
        String text = "New Text";
        TextNode node = new TextNode();
        node.text(text);
        assertEquals(text, node.text());
    }

}