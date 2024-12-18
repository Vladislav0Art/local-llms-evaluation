package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedWordWrapBuilderFromClasspathUtf8 {

    @Test
    public void wordWrapBuilderFromClasspathUtf8() {
        Builder builder = WordWrap.fromClasspathUtf8("example.txt");
        assertEquals(0, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with multiple lines
        String testText5 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspathUtf8("example.txt", Charset.forName("UTF-8"));
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with large buffer size
        String testText6 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspathUtf8("example.txt", Charset.forName("UTF-8"), 1000000);
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with no new line character
        String testText7 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspathUtf8("example.txt", Charset.forName("UTF-8"), 1000000);
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());

        // Test with null source
        try {
            WordWrap.fromClasspathUtf8(null, Charset.forName("UTF-8"));
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }

        // Test with invalid character set
        String testText8 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspathUtf8("example.txt", Charset.forName("UTF-16"));
        assertEquals(1, builder.getNewLineCount());
        assertFalse(builder.isBreakWords());
        assertTrue(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());

        // Test with empty string
        String testText9 = "";
        builder = WordWrap.fromClasspathUtf8("example.txt", Charset.forName("UTF-16"));
        assertEquals(1, builder.getNewLineCount());
        assertFalse(builder.isBreakWords());
        assertTrue(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());
    }

}