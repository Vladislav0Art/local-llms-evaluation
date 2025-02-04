package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class GeneratedIsBlank_GivenText_ReturnsExpectedValue {

    @Test
    public void isBlank_GivenText_ReturnsExpectedValue() {
        String text = "Hello World";
        assertTrue(textNode.isBlank());
        assertFalse(new TextNode("").isBlank());
    }

}