package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceReplacesWithSpaces {

    @Test
    public void normaliseWhitespaceReplacesWithSpaces() {
        String text = "\t\n\r";
        assertTrue(TextNode.normaliseWhitespace(text).equals("   "));
    }

}