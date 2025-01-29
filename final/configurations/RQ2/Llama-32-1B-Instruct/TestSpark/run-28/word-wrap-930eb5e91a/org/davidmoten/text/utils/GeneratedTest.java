package org.davidmoten.text.utils;

import java.util.ArrayList;
import java.util.List;

public class GeneratedTest {

    public String wordWrap(String input, String delimiter) {
        List<String> lines = new ArrayList<>();
        int currentLineLength = 0;
        for (String line : input.split("\n")) {
            if (line.trim().length() > currentLineLength) {
                lines.add(line.trim());
                currentLineLength = line.trim().length();
            } else {
                if (!currentLineLength == 0 || !lines.isEmpty()) {
                    lines.set(lines.size() - 1, lines.get(lines.size() - 1) + " " + line);
                }
                currentLineLength += line.length();
            }
        }
        String result = "";
        for (String line : lines) {
            if (!line.trim().isEmpty()) {
                result += line.trim();
                if (result.length() > delimiter.length() && !result.startsWith(delimiter)) {
                    result = result.substring(0, delimiter.length());
                    break;
                }
            } else {
                result = "";
            }
        }
        return result;
    }

    public String wordWrap(String input) {
        return wordWrap(input, "\n");
    }

    @Test
    public void testEmptyInput() {
        assertEquals("", WordWrapper.wordWrap(""));
    }

    @Test
    public void testSingleLineInput() {
        assertEquals("Hello World!", WordWrapper.wordWrap("Hello World!", " "));
    }

    @Test
    public void testMultipleLines() {
        List<String> lines = new ArrayList<>();
        lines.add("This is a line");
        lines.add("And this is another line");
        String result = WordWrapper.wordWrap(String.join("\n", lines), "\n");
        assertEquals("This is a line\nAnd this is another line", result);
    }

    @Test
    public void testMultipleLinesDelimiter() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), " | ");
        assertEquals("Line 1 | Line 2", result);
    }

    @Test
    public void testMultipleLinesDelimiterDash() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), "- ");
        assertEquals("- Line 1 - Line 2", result);
    }

    @Test
    public void testMultipleLinesDelimiterComma() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), ", ");
        assertEquals(", Line 1 , Line 2", result);
    }

    @Test
    public void testMultipleLines() {
        List<String> lines = new ArrayList<>();
        lines.add("This is a line");
        lines.add("And this is another line");
        String result = WordWrapper.wordWrap(String.join("\n", lines), " | ");
        assertEquals("This is a line | And this is another line", result);
    }

    @Test
    public void testMultipleLinesDelimiter() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), " | ");
        assertEquals("Line 1 | Line 2", result);
    }

    @Test
    public void testMultipleLinesDelimiterDash() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), "- ");
        assertEquals("- Line 1 - Line 2", result);
    }

    @Test
    public void testMultipleLinesDelimiterComma() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), ", ");
        assertEquals(", Line 1 , Line 2", result);
    }

    @Test
    public void testMultipleLines() {
        List<String> lines = new ArrayList<>();
        lines.add("This is a line");
        lines.add("And this is another line");
        String result = WordWrapper.wordWrap(String.join("\n", lines), " | ");
        assertEquals("This is a line | And this is another line", result);
    }

    @Test
    public void testMultipleLinesDelimiter() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), " | ");
        assertEquals("Line 1 | Line 2", result);
    }

    @Test
    public void testMultipleLinesDelimiterDash() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), "- ");
        assertEquals("- Line 1 - Line 2", result);
    }

    @Test
    public void testMultipleLinesDelimiterComma() {
        List<String> lines = new ArrayList<>();
        lines.add("Line 1");
        lines.add("Line 2");
        String result = WordWrapper.wordWrap(String.join("\n", lines), ", ");
        assertEquals(", Line 1 , Line 2", result);
    }

}