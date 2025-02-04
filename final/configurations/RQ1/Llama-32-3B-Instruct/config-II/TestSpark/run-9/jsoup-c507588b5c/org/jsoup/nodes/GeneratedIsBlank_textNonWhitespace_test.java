package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

public class GeneratedIsBlank_textNonWhitespace_test {

    @Test
    public void isBlank_textNonWhitespace_test() {
        String text = "Hello World!";
        TextNode textNode = new TextNode(text);
        assertFalse(textNode.isBlank());
    }

}