package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedStripLeadingWhitespace_GivenText_ReturnsCorrectStringWithTrailingWhitespaceRemoved {

    @Test
    public void stripLeadingWhitespace_GivenText_ReturnsCorrectStringWithTrailingWhitespaceRemoved() {
        String text = "   Hello World  ";
        assertEquals("Hello World", TextNode.stripLeadingWhitespace(text));
    }

}