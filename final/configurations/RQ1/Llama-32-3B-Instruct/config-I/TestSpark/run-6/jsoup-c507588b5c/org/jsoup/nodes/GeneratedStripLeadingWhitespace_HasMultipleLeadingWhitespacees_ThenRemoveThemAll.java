package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedStripLeadingWhitespace_HasMultipleLeadingWhitespacees_ThenRemoveThemAll {

    @Test
    public void stripLeadingWhitespace_HasMultipleLeadingWhitespacees_ThenRemoveThemAll() {
        assertEquals("Hello  World", StringUtil.stripLeadingWhitespace("   Hello World "));
    }
}

}