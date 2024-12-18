package org.davidmoten.text.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class GeneratedWordWrapBuilderFromClasspathWithClose {

    @Test
    public void wordWrapBuilderFromClasspathWithClose() {
        Builder builder = WordWrap.fromClasspath("example.txt");
        assertEquals(0, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with multiple lines
        String testText13 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspath("example.txt", Charset.forName("UTF-8"));
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with large buffer size
        String testText14 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspath("example.txt", Charset.forName("UTF-8"), 1000000);
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertTrue(builder.isExtraCharsSet());

        // Test with no new line character
        String testText15 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspath("example.txt", Charset.forName("UTF-8"), 1000000);
        assertEquals(1, builder.getNewLineCount());
        assertTrue(builder.isBreakWords());
        assertFalse(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());

        // Test with null source
        try {
            WordWrap.fromClasspath(null);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
        }

        // Test with invalid character set
        String testText16 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        builder = WordWrap.fromClasspath("example.txt", Charset.forName("UTF-16"));
        assertEquals(1, builder.getNewLineCount());
        assertFalse(builder.isBreakWords());
        assertTrue(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());

        // Test with empty string
        String testText17 = "";
        builder = WordWrap.fromClasspath("example.txt", Charset.forName("UTF-16"));
        assertEquals(1, builder.getNewLineCount());
        assertFalse(builder.isBreakWords());
        assertTrue(builder.isInsertHyphens());
        assertFalse(builder.isExtraCharsSet());
    }

}