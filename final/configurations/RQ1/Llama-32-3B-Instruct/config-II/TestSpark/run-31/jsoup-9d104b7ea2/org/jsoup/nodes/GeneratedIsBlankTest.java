package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedIsBlankTest {

    @Test
    public void IsBlankTest() {
        TextNode textNode = new TextNode("");
        assertTrue(textNode.isBlank());
        textNode.text("Hello World");
        assertFalse(textNode.isBlank());
    }

}