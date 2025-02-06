package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedNormaliseWhitespace_ReplacesTabsWithSpaces {

    @Test
    public void normaliseWhitespace_ReplacesTabsWithSpaces() {
        String text = "\texample";
        String expectedOutput = "example";
        assertEquals(expectedOutput, StringUtil.normaliseWhitespace(text));
    }

}