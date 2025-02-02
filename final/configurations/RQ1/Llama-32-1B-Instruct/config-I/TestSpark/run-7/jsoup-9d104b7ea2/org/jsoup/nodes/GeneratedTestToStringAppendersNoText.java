package org.jsoup.nodes;

public class GeneratedTestToStringAppendersNoText {

    private static final String TEXT = "This is some text.";

    @Test
    public void testToStringAppendersNoText() {
        StringBuilderAppender appender = new StringBuilderAppender();
        assertEquals("", appender.toString());
    }
}

class StringBuilderAppender {

    private String text;

    public void appendText(String text) {
        this.text += TEXT + " ";
    }

    @Override
    public String toString() {
        return text.trim();
    }

}