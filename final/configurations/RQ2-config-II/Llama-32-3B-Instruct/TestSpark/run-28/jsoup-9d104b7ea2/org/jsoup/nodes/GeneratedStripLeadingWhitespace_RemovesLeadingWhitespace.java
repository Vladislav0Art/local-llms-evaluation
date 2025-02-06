package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedStripLeadingWhitespace_RemovesLeadingWhitespace {

    @Test
    public void stripLeadingWhitespace_RemovesLeadingWhitespace() {
        String text = "   example";
        String expectedOutput = "example";
        assertEquals(expectedOutput, StringUtil.stripLeadingWhitespace(text));
    }

}