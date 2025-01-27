package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.mockito.Mockito;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;

public class GeneratedStripLeadingWhitespaceRemovesLeadingWhitespaceCharacters {

    @Test
    public void stripLeadingWhitespaceRemovesLeadingWhitespaceCharacters() {
        String result = StringUtil.stripLeadingWhitespace("   Hello");
        assertEquals("Hello", result);
    }

}