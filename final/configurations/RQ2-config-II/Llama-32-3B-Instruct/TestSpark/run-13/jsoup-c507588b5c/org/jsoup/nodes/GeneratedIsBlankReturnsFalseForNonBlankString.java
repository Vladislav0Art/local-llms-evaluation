package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlankReturnsFalseForNonBlankString {

    @Test
    public void isBlankReturnsFalseForNonBlankString() {
        String text = "Hello World";
        TextNode node = new TextNode(text);
        assertFalse(node.isBlank());
    }

}