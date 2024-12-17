package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceMethodNormalisesWhitespaceCorrectlyTest {

    @Test
    public void normaliseWhitespaceMethodNormalisesWhitespaceCorrectlyTest() {
        String text = "   Hello World  ";
        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, TextNode.normaliseWhitespace(text));
    }

}