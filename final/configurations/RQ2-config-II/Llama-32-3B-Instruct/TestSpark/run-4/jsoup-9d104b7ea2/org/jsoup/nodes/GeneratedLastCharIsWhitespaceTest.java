package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        assertTrue(StringBuilderUtil.lastCharIsWhitespace(new StringBuilder(" ")));
    }

}