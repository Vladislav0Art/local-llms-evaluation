package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedNormaliseWhitespace_AddsLeadingSpaces {

    @Test
    public void normaliseWhitespace_AddsLeadingSpaces() {
        String text = "  Hello   World ";
        assertEquals("  Hello   World ", TextNode.normaliseWhitespace(text));
    }

}