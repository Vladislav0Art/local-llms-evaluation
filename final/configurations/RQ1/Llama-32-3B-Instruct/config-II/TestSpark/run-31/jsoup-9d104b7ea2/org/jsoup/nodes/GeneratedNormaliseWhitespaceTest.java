package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void NormaliseWhitespaceTest() {
        String normalisedText = TextNode.normaliseWhitespace("   Hello World  ");
        assertEquals("Hello World", normalisedText);
    }

}