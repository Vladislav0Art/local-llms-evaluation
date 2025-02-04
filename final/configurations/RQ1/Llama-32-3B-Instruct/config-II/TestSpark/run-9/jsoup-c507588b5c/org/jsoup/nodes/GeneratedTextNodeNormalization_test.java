package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedTextNodeNormalization_test {

    @Test
    public void textNodeNormalization_test() {
        String text = "   ";
        TextNode textNode = new TextNode(text);
        assertEquals(StringUtil.normaliseWhitespace(text), textNode.text());
    }

}