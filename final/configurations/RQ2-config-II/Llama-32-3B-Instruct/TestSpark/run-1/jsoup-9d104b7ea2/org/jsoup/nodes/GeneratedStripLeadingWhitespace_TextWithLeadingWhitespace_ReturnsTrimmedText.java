package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Collections;

public class GeneratedStripLeadingWhitespace_TextWithLeadingWhitespace_ReturnsTrimmedText {

    @Test
    public void stripLeadingWhitespace_TextWithLeadingWhitespace_ReturnsTrimmedText() {
        String original = "\t";
        String expected = "";
        String result = StringUtil.stripLeadingWhitespace(original);
        assertEquals(expected, result);
    }

}