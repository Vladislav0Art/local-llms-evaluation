package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedIsBlank_GivenTextNode_ReturnsFalse {

    public String normaliseWhitespace(String input) {
        // implementation of StringUtil.normaliseWhitespace method
        return input.replaceAll("\\s+", " ");
    }

    @Test
    public void isBlank_GivenTextNode_ReturnsFalse() {
        TextNode textNode = new TextNode(" ");
        assertFalse(textNode.isBlank());
    }

}