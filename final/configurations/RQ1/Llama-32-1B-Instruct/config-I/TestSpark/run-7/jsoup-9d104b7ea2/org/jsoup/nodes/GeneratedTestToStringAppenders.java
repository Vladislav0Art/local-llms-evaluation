package org.jsoup.nodes;

public class GeneratedTestToStringAppenders {

    private static final String TEXT = "This is some text.";

    @Test
    public void testToStringAppenders() {
        StringBuilderAppender appender = new StringBuilderAppender();
        appender.appendText(TEXT);
        assertEquals("text." + TEXT, appender.toString());
    }

}