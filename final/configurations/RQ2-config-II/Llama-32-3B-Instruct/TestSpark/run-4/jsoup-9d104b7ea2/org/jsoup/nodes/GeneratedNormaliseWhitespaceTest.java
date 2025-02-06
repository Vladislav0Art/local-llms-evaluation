package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTest {

    @Test
    public void normaliseWhitespaceTest() {
        assertEquals("Hello World", StringUtil.normaliseWhitespace("   Hello World  "));
    }

}