package org.davidmoten.text.utils;

import org.davidmoten.text.utils.*;

public class GeneratedTest {

    @Test
    public void testWordWrapNoInsertHyphens() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(WordWrap.wordWrap(reader, 10));
    }

    @Test
    public void testWordWrapWithInsertHyphens() {
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(new BufferedReader(new InputStreamReader(System.in)), 10, (s) -> s.split("\n"), (s) -> s + "-", null, new HashSet<>(), true, false);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            lines.add(line);
            lines.get(lines.size() - 1).append("x");
        }
        System.out.println(String.join("\n", lines));
    }

    @Test
    public void testWordWrapWithExtraWordCharsNoInsertHyphens() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(reader, 10, (s) -> s.split("\n"), (s) -> s.split("\\s+"), null, false, true);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
        System.out.println(String.join("\n", lines));
    }

    @Test
    public void testWordWrapWithExtraWordCharsInsertHyphens() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(reader, 10, (s) -> s.split("\n"), (s) -> s + "-", null, new HashSet<>(), true, false);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
        System.out.println(String.join("\n", lines));
    }

    @Test
    public void testWordWrapWithExtraWordCharsNoInsertHyphensAndExtraChars() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(reader, 10, (s) -> s.split("\n"), (s) -> s.split("\\s+"), null, false, true);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
        String[] expected = {"xx"};
        for (String line : splitLines) {
            assertTrue(line.startsWith("xx"));
        }
    }

    @Test
    public void testWordWrapWithExtraWordCharsNoInsertHyphensAndNoExtraChars() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder word = new StringBuilder();
        List<String> lines = new ArrayList<>();
        String[] splitLines = WordWrap.wordWrap(reader, 10, (s) -> s.split("\n"), (s) -> s + "-", null, false, true);
        for (String line : splitLines) {
            assertTrue(line.startsWith("This is a test"));
            word.append(line);
            lines.add(word.toString());
            word.setLength(0);
        }
    }

    @Test
    public void testClose() {
        System.out.println(Closeword.close(System.in));
        assertTrue(true);
    }

}