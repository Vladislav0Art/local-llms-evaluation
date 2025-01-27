package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedCreateFromEncodedTextContainsOnlyWhitespaceIsBlank {

    @Test
    public void createFromEncodedTextContainsOnlyWhitespaceIsBlank() {
        assertEquals(true, new TextNode(TextNode.normaliseWhitespace("   ")).isBlank());
    }

}