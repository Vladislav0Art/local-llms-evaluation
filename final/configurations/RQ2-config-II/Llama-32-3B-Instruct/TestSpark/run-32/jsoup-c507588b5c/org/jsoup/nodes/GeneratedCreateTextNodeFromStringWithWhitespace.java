package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCreateTextNodeFromStringWithWhitespace {

    @Test
    public void createTextNodeFromStringWithWhitespace() {
        String text = "   Hello   World  ";
        TextNode expectedTextNode = new TextNode(text);
        assertTrue(TextNode.createFromEncoded(text).equals(expectedTextNode));
    }

}