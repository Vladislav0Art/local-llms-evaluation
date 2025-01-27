package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedStripLeadingWhitespace_LeadingWhitespaceReturnsEmptyString {

    @Test
    public void stripLeadingWhitespace_LeadingWhitespaceReturnsEmptyString() {
        String text = "   Leading whitespace";
        assertEquals("", StringUtil.stripLeadingWhitespace(text));
    }
}

class Document {
    static class OutputSettings {
    }

}