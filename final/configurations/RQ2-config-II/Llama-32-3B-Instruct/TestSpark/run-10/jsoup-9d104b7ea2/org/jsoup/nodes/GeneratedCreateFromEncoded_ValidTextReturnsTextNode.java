package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedCreateFromEncoded_ValidTextReturnsTextNode {

    @Test
    public void createFromEncoded_ValidTextReturnsTextNode() throws Exception {
        String encodedText = "TextNode";
        TextNode result = TextNode.createFromEncoded(encodedText);
        assertNotNull(result);
        assertEquals(encodedText, ((TextNode) result).text());
    }

}