package org.jsoup.nodes;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GeneratedStripLeadingWhitespace_LeadingWhitespaceReturnsEmptyString {

    @Test
    public void stripLeadingWhitespace_LeadingWhitespaceReturnsEmptyString() {
        assertEquals("", StringUtil.stripLeadingWhitespace("   "));
    }

}