package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuilder;

public class GeneratedTextMethod_ReturnsNormalisedWhitespace {

    @Test
    public void textMethod_ReturnsNormalisedWhitespace() {
        String text = "   Hello World!  ";
        TextNode textNode = new TextNode(text);
        assertEquals("Hello World!", StringUtil.normaliseWhitespace(textNode.text()));
    }

}