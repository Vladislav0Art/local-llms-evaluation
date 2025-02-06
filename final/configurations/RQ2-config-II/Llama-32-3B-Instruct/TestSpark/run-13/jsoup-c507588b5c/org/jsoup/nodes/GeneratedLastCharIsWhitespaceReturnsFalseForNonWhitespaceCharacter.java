package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceReturnsFalseForNonWhitespaceCharacter {

    @Test
    public void lastCharIsWhitespaceReturnsFalseForNonWhitespaceCharacter() {
        StringBuilder sb = new StringBuilder("Hello");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}