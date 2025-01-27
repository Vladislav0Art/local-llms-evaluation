package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestLastCharIsWhitespaceStringEndsWithWhitespace {

    @Test
    public void testLastCharIsWhitespaceStringEndsWithWhitespace() {
        StringBuilder builder = new StringBuilder();
        assertTrue(Document.OutputSettings.lastCharIsWhitespace(builder.append(' ')));
    }
}

public class DocumentOutputSettings {

    private static boolean lastCharIsWhitespace(StringBuilder builder) {
        return builder.length() > 0 && Character.isWhitespace(builder.charAt(builder.length() - 1));
    }

    public static boolean lastCharIsWhitespace(int length, OutputSettings settings) {
        return lastCharIsWhitespace(new StringBuilder(settings.toString()));
    }
}

public class StringUtil {

    private static String stripLeadingWhitespace(String input) {
        int start = input.indexOfFirstNonWhitespace();
        if (start == -1) return "";
        return input.substring(start);
    }

    public static String stripLeadingWhitespace(StringBuilder builder, int length, OutputSettings settings) {
        return stripLeadingWhitespace(settings.toString());
    }
}

public class OutputSettings {

    private StringBuilder string;

    public OutputSettings() {
        this.string = new StringBuilder();
    }

    public String toString() {
        return string.toString();
    }

    public Document.OutputSettings lastCharIsWhitespace(int length) {
        return new Document.OutputSettings(lastCharIsWhitespace(this, length));
    }
}

public class Document {

    private static boolean lastCharIsWhitespace(StringBuilder builder, int length, OutputSettings settings) {
        if (builder.length() > 0 && Character.isWhitespace(builder.charAt(length - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public static Document.OutputSettings lastCharIsWhitespace(OutputSettings settings) {
        return new Document.OutputSettings(lastCharIsWhitespace(settings.toString(), 0, settings));
    }
}

public class OutputSettings {

    private StringBuilder string;

    public OutputSettings(StringBuilder builder) {
        this.string = builder;
    }

    public String toString() {
        return string.toString();
    }

}