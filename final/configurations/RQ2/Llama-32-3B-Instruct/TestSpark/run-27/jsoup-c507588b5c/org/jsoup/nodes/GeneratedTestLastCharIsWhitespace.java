package org.jsoup.nodes;

public class GeneratedTestLastCharIsWhitespace {

    private StringBuilder string;

    public DocumentOutputSettings(StringBuilder string) {
        this.string = string;
    }

    public static boolean lastCharIsWhitespace(StringBuilder builder, int length) {
        if (builder.length() > 0 && Character.isWhitespace(builder.charAt(length - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public DocumentOutputSettings lastCharIsWhitespace(int length) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (!lastCharIsWhitespace(newString, i)) {
                newString.append(string.charAt(i));
            } else {
                break;
            }
        }
        return new DocumentOutputSettings(newString);
    }

    public static Document.OutputSettings lastCharIsWhitespace(OutputSettings settings) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < settings.toString().length(); i++) {
            if (!lastCharIsWhitespace(newStringBuilder, i)) {
                newStringBuilder.append(settings.toString().charAt(i));
            } else {
                break;
            }
        }
        return new Document.OutputSettings(newStringBuilder);
    }
}

public class StringUtil {
    private StringBuilder builder;

    public StringUtil(StringBuilder builder) {
        this.builder = builder;
    }

    public String stripLeadingWhitespace() {
        int start = builder.indexOfFirstNonWhitespace();
        if (start == -1) return "";
        return builder.substring(start);
    }

    public static String stripLeadingWhitespace(String input) {
        StringBuilder newStringBuilder = new StringBuilder(input);
        int start = newStringBuilder.indexOfFirstNonWhitespace();
        if (start == -1) return "";
        newStringBuilder.deleteCharAt(start);
        return newStringBuilder.toString();
    }
}

public class OutputSettings {

}

public class Document {
    public static boolean lastCharIsWhitespace(StringBuilder builder, int length, OutputSettings settings) {
        if (builder.length() > 0 && Character.isWhitespace(builder.charAt(length - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public static Document.OutputSettings lastCharIsWhitespace(OutputSettings settings) {
        StringBuilder newStringBuilder = new StringBuilder();
        for (int i = 0; i < settings.toString().length(); i++) {
            if (!lastCharIsWhitespace(newStringBuilder, i, settings)) {
                newStringBuilder.append(settings.toString().charAt(i));
            } else {
                break;
            }
        }
        return new Document.OutputSettings(newStringBuilder);
    }

    public Document(OutputSettings settings) {
        this.settings = settings;
    }

    private OutputSettings settings;

    public boolean lastCharIsWhitespace() {
        return lastCharIsWhitespace(settings, 0).lastCharIsWhitespace();
    }
}

public class TestDocument {

    @Test
    public void testLastCharIsWhitespace() {
        Document.OutputSettings settings = new Document(new OutputSettings()).lastCharIsWhitespace();
        assertTrue(settings.lastCharIsWhitespace());
    }

}