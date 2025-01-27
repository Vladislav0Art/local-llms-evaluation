package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedText_NullableText_RetursEmptyString {

    @Test
    public void text_NullableText_RetursEmptyString() {
        TextNode textNode = new TextNode(null);
        assertEquals("", textNode.text());
    }

}