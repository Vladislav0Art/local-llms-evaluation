package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedIsBlank_EmptyString_ReturnsTrue {

    @Test
    public void isBlank_EmptyString_ReturnsTrue() {
        String emptyString = "";
        boolean result = new TextNode(emptyString).isBlank();
        assertTrue(result);
    }

}