package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder sb = new StringBuilder("   ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
        assertFalse(TextNode.lastCharIsWhitespace(new StringBuilder()));
    }

}