package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedIsBlank_ReturnsFalseForNonEmptyString {

    @Test
    public void isBlank_ReturnsFalseForNonEmptyString() {
        TextNode node = new TextNode("test");
        assertFalse(node.isBlank());
    }

}