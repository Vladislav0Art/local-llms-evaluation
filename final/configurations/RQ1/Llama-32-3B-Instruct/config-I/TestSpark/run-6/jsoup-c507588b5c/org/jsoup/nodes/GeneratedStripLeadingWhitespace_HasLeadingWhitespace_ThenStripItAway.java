package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedStripLeadingWhitespace_HasLeadingWhitespace_ThenStripItAway {

    @Test
    public void stripLeadingWhitespace_HasLeadingWhitespace_ThenStripItAway() {
        assertEquals("World", StringUtil.stripLeadingWhitespace("   World"));
    }

}