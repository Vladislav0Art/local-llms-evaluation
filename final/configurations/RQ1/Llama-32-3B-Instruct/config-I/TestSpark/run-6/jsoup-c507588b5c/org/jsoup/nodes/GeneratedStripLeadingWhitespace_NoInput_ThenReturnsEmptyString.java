package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedStripLeadingWhitespace_NoInput_ThenReturnsEmptyString {

    @Test
    public void stripLeadingWhitespace_NoInput_ThenReturnsEmptyString() {
        assertEquals("", StringUtil.stripLeadingWhitespace(""));
    }

}