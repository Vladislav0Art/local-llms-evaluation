package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestGetWholeText {

    @Test
    public void testGetWholeText() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertEquals(text, textNode.getWholeText());
    }

}