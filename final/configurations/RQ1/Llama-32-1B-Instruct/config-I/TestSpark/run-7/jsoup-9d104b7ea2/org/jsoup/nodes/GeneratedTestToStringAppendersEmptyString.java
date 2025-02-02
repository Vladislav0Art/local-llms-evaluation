package org.jsoup.nodes;

public class GeneratedTestToStringAppendersEmptyString {

    private static final String TEXT = "This is some text.";

    @Test
    public void testToStringAppendersEmptyString() {
        StringBuilderAppender appender = new StringBuilderAppender();
        String expected = "";
        assertEquals(expected, appender.toString());
    }

}