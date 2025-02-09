package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedIsBlank_NotEmptyString_ReturnsFalse {

    @Test
    public void isBlank_NotEmptyString_ReturnsFalse() {
        String notEmptyString = "Hello, World!";
        boolean result = new TextNode(notEmptyString).isBlank();
        assertFalse(result);
    }

}