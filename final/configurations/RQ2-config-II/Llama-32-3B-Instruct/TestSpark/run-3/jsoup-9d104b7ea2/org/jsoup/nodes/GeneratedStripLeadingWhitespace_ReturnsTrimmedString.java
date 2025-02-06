package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.List;

@RunWith(JUnit4.class)
public class GeneratedStripLeadingWhitespace_ReturnsTrimmedString {

    @Test
    public void stripLeadingWhitespace_ReturnsTrimmedString() {
        String text = "   test";
        String result = StringUtil.stripLeadingWhitespace(text);
        assertEquals("test", result);
    }

}