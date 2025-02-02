package org.jsoup.nodes;

public class GeneratedTestConnection {

    public static boolean isTrue(int value) {
        return value > 0;
    }

    public static void assertTrue(boolean value, String message) {
        if (!value) {
            throw new AssertionError(message);
        }
    }

    public static void validate(int value, int minValue, int maxValue) {
        assertTrue(value >= minValue && value <= maxValue, "Invalid value");
    }
}

public class OutputSettings {
    private boolean prettyPrint;
    private int indentAmount;
    private int maxPaddingWidth;

    public OutputSettings() {
    }

    public boolean isPrettyPrintEnabled() {
        return prettyPrint;
    }

    public void setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public int getIndentAmount() {
        return indentAmount;
    }

    public void setIndentAmount(int indentAmount) {
        validate(indentAmount, 0, Integer.MAX_VALUE);
        this.indentAmount = indentAmount;
    }

    public int getMaxPaddingWidth() {
        return maxPaddingWidth;
    }

    public void setMaxPaddingWidth(int maxPaddingWidth) {
        validate(maxPaddingWidth, -1, Integer.MAX_VALUE);
        this.maxPaddingWidth = maxPaddingWidth;
    }

    private static void validate(int value, int minValue, int maxValue) {
        if (value < minValue || value > maxValue) {
            throw new AssertionError("Value out of range");
        }
    }
}

public class Parser {
    private String type;

    public Parser(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

public class Connection {
    private String url;

    public Connection(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}

public class QuirksMode {
    public enum Mode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    private Mode mode;

    public QuirksMode(Mode mode) {
        this.mode = mode;
    }

    public Mode getMode() {
        return mode;
    }
}

public class Test {

    @Test
    public void testConnection() {
        Connection connection = new Connection("https://example.com");
        System.out.println(connection.getUrl());
    }

}