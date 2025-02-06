package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

public class GeneratedNormaliseWhitespace_CasesSensitive {

    @Test
    public void normaliseWhitespace_CasesSensitive() {
        String text = "Example";
        String expectedOutput = "example";
        assertEquals(expectedOutput, StringUtil.normaliseWhitespace(text));
    }

}