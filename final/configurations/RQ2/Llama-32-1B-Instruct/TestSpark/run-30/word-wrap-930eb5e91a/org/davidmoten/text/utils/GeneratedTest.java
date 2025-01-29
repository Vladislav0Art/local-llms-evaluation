package org.davidmoten.text.utils;

public class GeneratedTest {

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    @Test
    public void testFromReader() throws IOException {
        Writer writer = WordWrap.from(reader);
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.from(reader).toString());
    }

    @Test
    public void testFromClasspathUtf8() throws IOException {
        Writer writer = WordWrap.fromClasspathUtf8("test.txt");
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.fromClasspathUtf8("test.txt").toString());
    }

    @Test
    public void testFromClasspath() throws IOException {
        Writer writer = WordWrap.fromClasspath("test.txt");
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.fromClasspath("test.txt").toString());
    }

    @Test
    public void testFrom() throws IOException {
        Writer writer = WordWrap.from(new FileInputStream("test.txt"));
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.from(new FileInputStream("test.txt")).toString());
    }

    @Test
    public void testFromUtf8() throws IOException {
        Writer writer = WordWrap.fromUtf8(new FileInputStream("test.txt"));
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.fromUtf8(new FileInputStream("test.txt")).toString());
    }

    @Test
    public void testFromClasspathUtf8() throws IOException {
        Writer writer = WordWrap.fromClasspathUtf8(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.fromClasspathUtf8(new InputStreamReader(System.in, StandardCharsets.UTF_8)).toString());
    }

    @Test
    public void testFromClasspath() throws IOException {
        Writer writer = WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8);
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8).toString());
    }

    @Test
    public void testFrom() throws IOException {
        Writer writer = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, new InputStreamReader(System.in, StandardCharsets.UTF_8).toString());
    }

    @Test
    public void testFromUtf8() throws IOException {
        Writer writer = WordWrap.fromUtf8(new FileInputStream("test.txt"));
        String input = "Hello\nWorld";
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '\n' && i + 1 < input.length()) {
                int nextCharCount = WordWrap.wordWrap(reader, writer, "\n", 100, null, null, false, false).length;
                output.append(c);
                output.append(' ');
                for (int j = 0; j < nextCharCount - 1; j++) {
                    output.append(c);
                }
            } else {
                output.append(c);
            }
        }

        String expectedOutput = "Hello World";
        assertEquals(expectedOutput, WordWrap.fromUtf8(new FileInputStream("test.txt")).toString());
    }

}