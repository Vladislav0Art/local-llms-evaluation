package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTest {

    @Test
    public void stripLeadingWhitespaceTest() {
        assertEquals("Hello World", StringUtil.stripLeadingWhitespace("  Hello World"));
    }

}