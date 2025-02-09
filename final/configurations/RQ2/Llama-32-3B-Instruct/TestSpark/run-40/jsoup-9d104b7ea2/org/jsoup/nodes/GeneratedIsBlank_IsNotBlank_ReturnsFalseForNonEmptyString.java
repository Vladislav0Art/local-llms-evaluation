package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedIsBlank_IsNotBlank_ReturnsFalseForNonEmptyString {

    @Test
    public void isBlank_IsNotBlank_ReturnsFalseForNonEmptyString() {
        TextNode node = new TextNode("text");
        assertFalse(node.isBlank());
    }

}