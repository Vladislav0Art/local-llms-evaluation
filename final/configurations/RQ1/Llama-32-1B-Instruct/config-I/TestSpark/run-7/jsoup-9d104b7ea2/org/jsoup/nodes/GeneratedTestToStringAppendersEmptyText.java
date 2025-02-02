package org.jsoup.nodes;

public class GeneratedTestToStringAppendersEmptyText {

    private static final String TEXT = "This is some text.";

    @Test
    public void testToStringAppendersEmptyText() {
        StringBuilderAppender appender = new StringBuilderAppender();
        appender.appendText("");
        assertEquals("", appender.toString());
    }

}