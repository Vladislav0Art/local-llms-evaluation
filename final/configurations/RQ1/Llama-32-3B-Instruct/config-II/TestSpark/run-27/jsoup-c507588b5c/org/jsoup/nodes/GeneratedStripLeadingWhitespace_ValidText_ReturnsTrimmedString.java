package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedStripLeadingWhitespace_ValidText_ReturnsTrimmedString {

    @Test
    public void stripLeadingWhitespace_ValidText_ReturnsTrimmedString() {
        String text = "   Hello World  ";
        String expected = "Hello World";
        assertEquals(expected, StringUtil.stripLeadingWhitespace(text));
    }
}

}