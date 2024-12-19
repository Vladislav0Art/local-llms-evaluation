package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

import java.io.IOException;

import org.junit.jupiter.api.Test;

public class GeneratedToString {

    @Test
    public void toString() {
        TextNode node = new TextNode("");
        String expected = "<text></text>";
        String actual = node.toString();
        assertEquals(expected, actual);
    }

}