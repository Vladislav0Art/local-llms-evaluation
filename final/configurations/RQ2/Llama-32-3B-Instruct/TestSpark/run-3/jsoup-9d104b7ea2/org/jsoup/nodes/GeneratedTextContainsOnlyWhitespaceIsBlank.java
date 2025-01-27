package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.jsoup.helper.Validate;

import static org.mockito.Mockito.*;

public class GeneratedTextContainsOnlyWhitespaceIsBlank {

    @Test
    public void textContainsOnlyWhitespaceIsBlank() {
        assertEquals(true, new TextNode("   ").isBlank());
    }

}