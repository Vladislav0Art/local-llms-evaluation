package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTest {

    @Test
    public void testWordWrapWithoutLineBreak() {
        Reader reader = new InputStreamReader(System.in);
        StringBuilder word = new StringBuilder();
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = reader.read(buffer)) != -1) {
            String line = new String(buffer, 0, len).trim();
            if (line.length() > WordWrap.this.maxWidth) {
                word.append("\n");
            }
            word.append(line);
        }

        CharSet charset = StandardCharsets.UTF_8;
        Writer out = new OutputStreamWriter(System.out);

        assertTrue(WordWrap.wordWrap(reader, out, WordWrap.this.maxWidth, null, (s) -> s.length() * 1.5f, null, word::length, HashSet.of(), false, true).length() > 0);
    }

    @Test
    public void testWordWrapWithLineBreak() {
        Reader reader = new InputStreamReader(System.in);
        StringBuilder word = new StringBuilder();
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = reader.read(buffer)) != -1) {
            String line = new String(buffer, 0, len).trim();
            if (line.length() > WordWrap.this.maxWidth) {
                word.append("\n").append(line);
            } else {
                word.append(line);
            }
        }

        CharSet charset = StandardCharsets.UTF_8;
        Writer out = new OutputStreamWriter(System.out);

        assertTrue(WordWrap.wordWrap(reader, out, WordWrap.this.maxWidth, null, (s) -> s.length() * 1.5f, word::length, HashSet.of(), false, true).length() > 0);
    }

    @Test
    public void testWordWrapWithExtraWhitespaceChar() {
        Reader reader = new InputStreamReader(System.in);
        StringBuilder word = new StringBuilder();
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = reader.read(buffer)) != -1) {
            String line = new String(buffer, 0, len).trim();
            if (line.length() > WordWrap.this.maxWidth) {
                word.append("\n").append(line);
            } else {
                word.append(line);
            }
        }

        CharSet charset = StandardCharsets.UTF_8;
        Writer out = new OutputStreamWriter(System.out);

        assertTrue(WordWrap.wordWrap(reader, out, WordWrap.this.maxWidth, null, (s) -> s.length() * 1.5f, null, word::length, HashSet.of(), false, true).length() > 0);
    }

    @Test
    public void testWordWrapWithNullCharacter() {
        Reader reader = new InputStreamReader(System.in);
        StringBuilder word = new StringBuilder();
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = reader.read(buffer)) != -1) {
            String line = new String(buffer, 0, len).trim();
            if (line.length() > WordWrap.this.maxWidth) {
                word.append("\n");
            }
            word.append(line);
        }

        CharSet charset = StandardCharsets.UTF_8;
        Writer out = new OutputStreamWriter(System.out);

        assertTrue(WordWrap.wordWrap(reader, out, WordWrap.this.maxWidth, null, (s) -> s.length() * 1.5f, null, word::length, HashSet.of(), false, true).length() > 0);
    }

    @Test
    public void testWordWrapWithEmptyString() {
        Reader reader = new InputStreamReader(System.in);
        StringBuilder word = new StringBuilder();
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = reader.read(buffer)) != -1) {
            String line = new String(buffer, 0, len).trim();
            if (line.length() > WordWrap.this.maxWidth) {
                word.append("\n");
            }
            word.append(line);
        }

        CharSet charset = StandardCharsets.UTF_8;
        Writer out = new OutputStreamWriter(System.out);

        assertTrue(WordWrap.wordWrap(reader, out, WordWrap.this.maxWidth, null, (s) -> s.length() * 1.5f, null, word::length, HashSet.of(), false, true).length() > 0);
    }

    public static class CharSet {
        private final Set<Character> set;

        public CharSet(Set<Character> set) {
            this.set = set;
        }

        public boolean contains(char c) {
            return set.contains(c);
        }
    }

    public static String wordWrap(String input, int maxWidth, StringBuilder builder, String delimiter, BiFunction<Integer, Integer, Double> calculation, Builder builder2, Set<CharSequence> allowedElements, boolean allowEmptyString, boolean allowNullCharacter) {
        if (input == null) {
            return null;
        }
        if (allowedElements == null) {
            throw new NullPointerException("Set is required");
        }

        if (builder == null) {
            builder = new StringBuilder();
        } else {
            builder.clear();
        }

        while (true) {
            int length = Math.min(maxWidth, input.length());
            String currentLine = input.substring(0, length);
            input = input.substring(length);

            if (!currentLine.isEmpty()) {
                if (currentLine.trim().endsWith(delimiter)) {
                    currentLine = currentLine.substring(0, currentLine.lastIndexOf(delimiter));
                }

                builder.append(currentLine).append(delimiter);
            } else {
                break;
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (char c : builder.toString().toCharArray()) {
            if (!allowedElements.contains(c)) {
                throw new NullPointerException("Character is not allowed in the input");
            }
        }

        return resultBuilder.toString();
    }

    public static class Builder {
        private String input;
        private int maxWidth;
        private StringBuilder builder;

        public void append(String element) {
            this.input += element;
        }

        public void append(int length) {
            if (length > 0 && !input.isEmpty()) {
                this.builder.append(input.substring(0, length));
                this.input = input.substring(length);
            } else {
                this.builder = new StringBuilder();
            }
        }

        public String getOutput() {
            return wordWrap(this.input, this.maxWidth, this.builder, " ", (s) -> s.length(), s -> s + s, Builder.of(input), HashSet.of(), false, true).trim();
        }
    }

    public static final void main(String[] args) {
        WordWrapBuilderTest test = new WordWrapBuilderTest();

        String input = "Hello World\nWorld is beautiful";
        int maxWidth = 20;
        StringBuilder builder = new StringBuilder();

        assertTrue(test.wordWrap(input, maxWidth, builder, "\n", (s) -> s.length() * 1.5f, null, Builder.of(input), HashSet.of(), true, false).length() > 0);

        System.out.println(test.getOutput());
    }

}