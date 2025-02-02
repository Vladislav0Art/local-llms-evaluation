package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedCreateTextNode_NullText_ThrowsIOException {

    @Test
    public void CreateTextNode_NullText_ThrowsIOException() {
        try {
            new TextNode(null);
            fail("Expected IOException");
        } catch (IOException e) {
            // expected
        }
    }

}