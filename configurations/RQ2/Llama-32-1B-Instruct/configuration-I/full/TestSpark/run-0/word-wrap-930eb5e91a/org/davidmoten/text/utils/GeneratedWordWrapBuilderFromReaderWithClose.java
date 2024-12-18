package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedWordWrapBuilderFromReaderWithClose {

    @Test
    public void wordWrapBuilderFromReaderWithClose() {
        Builder builder = WordWrap.from(new java.io.BufferedReader(new java.io.InputStreamReader(System.in), 1000000));
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with large buffer size
        String testText10 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.from(new java.io.BufferedReader(new java.io.InputStreamReader(System.in), 1000000));
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with null source
        try {
            WordWrap.from(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }

        // Test with invalid character set
        String testText11 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.from(new java.io.BufferedReader(new java.io.InputStreamReader(System.in), 1000000));
        assertEquals(1, builder.getNewLineCount());
        assertFalse(builder.isBreakWords());
        assertTrue(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());

        // Test with empty string
        String testText12 = "";
        builder = WordWrap.from(new java.io.BufferedReader(new java.io.InputStreamReader(System.in), 1000000));
        assertEquals(1, builder.getNewLineCount());
        assertFalse(builder.isBreakWords());
        assertTrue(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());
    }

}