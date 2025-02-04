package org.jsoup.nodes;

import java.net.Connection;

import org.junit.Test;

public class GeneratedTestOutputSettings {

    private String title;
    private String html;

    // getters and setters

    public Document() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getHtml() {
        return html;
    }
}

// OutputSettings.java

public class OutputSettings {
    private boolean prettyPrint;
    private int indentAmount;
    private int maxPaddingWidth;

    // getters and setters

    public OutputSettings() {
    }

    public void setPrettyPrint(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    public boolean isPrettyPrint() {
        return prettyPrint;
    }

    public void setIndentAmount(int indentAmount) {
        this.indentAmount = indentAmount;
    }

    public int getIndentAmount() {
        return indentAmount;
    }

    public void setMaxPaddingWidth(int maxPaddingWidth) {
        this.maxPaddingWidth = maxPaddingWidth;
    }

    public int getMaxPaddingWidth() {
        return maxPaddingWidth;
    }
}

// QuirksMode.java

public class QuirksMode {
    private String name;

    // getters and setters

    public QuirksMode() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Parser.java

public interface Parser {
    Object parse(String html);
}

// Connection.java

import java.net.Connection;

public class Connection {
    private static Connection instance;

    private Connection() {
    }

    public static Connection newRequest() {
        if (instance == null) {
            instance = new Connection();
        }
        return instance;
    }

    // getters and setters
}

// TestDocument.java

import org.junit.Test;

public class TestDocument {

    @Test
    public void testOutputSettings() {
        OutputSettings outputSettings = new OutputSettings();
        assertTrue(outputSettings.isPrettyPrint());
        assertNotEquals(0, outputSettings.getIndentAmount());
        assertNotEquals(-1, outputSettings.getMaxPaddingWidth());
    }

}