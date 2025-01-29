package org.davidmoten.text.utils;

public class GeneratedTest {

    @Test
    public void testWordWrap_Reader() {
        WordWrap wordWrap = WordWrap.from(new InputStreamReader(System.in));
        wordWrap.wordWrap("Hello, world!", System.out, "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        wordWrap.close(System.out);
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_ReaderClose() {
        WordWrap wordWrap = WordWrap.from(new InputStreamReader(System.in));
        wordWrap.wordWrap("Hello, world!", new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        wordWrap.close();
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_Reader() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderClose() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        wordWrap.close();
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_FromClasspath_Reader() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello", StandardCharsets.UTF_8);
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_FromClasspath_ReaderClose() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello", StandardCharsets.UTF_8);
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        wordWrap.close();
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderFunction() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        Function<CharSequence, Number> stringWidth = s -> s.length();
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, stringWidth, HashSet.of(' '), false, true);
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderSetExtraWordChars() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        Set<Character> extraWordChars = HashSet.of(' ');
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, extraWordChars, false, true);
        assert "World".length() == 6;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderInsertHyphens() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        boolean insertHyphens = true;
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, insertHyphens, false, true);
        assert "Hello\nWorld".length() == 13;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderBreakWords() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        boolean breakWords = true;
        wordWrap.wordWrap(new InputStreamReader(System.in), new OutputStreamWriter(System.out), "\n", 10, breakWords, false, true);
        assert "World\n".length() == 7;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderLineConsumer() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        LineConsumer out = WordWrap.lineConsumer();
        String[] lines = {"Hello\nWorld", "FooBar"};
        for (String line : lines) {
            wordWrap.wordWrap(new InputStreamReader(System.in), out, "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        }
        assert "World".length() == 7;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderCloseLineConsumer() {
        WordWrap wordWrap = WordWrap.fromClasspathUtf8("Hello", StandardCharsets.UTF_8);
        LineConsumer out = WordWrap.lineConsumer();
        String[] lines = {"Hello\nWorld", "FooBar"};
        for (String line : lines) {
            wordWrap.wordWrap(new InputStreamReader(System.in), out, "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
        }
        wordWrap.close();
        assert "World".length() == 7;
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderCloseLineConsumerWithFile() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello.txt", StandardCharsets.UTF_8);
        File file = new File("Hello.txt");
        try (InputStream in = new FileInputStream(file)) {
            LineConsumer out = WordWrap.lineConsumer();
            String[] lines = {"Hello\nWorld", "FooBar"};
            for (String line : lines) {
                wordWrap.wordWrap(in, out, "\n", 10, s -> s.length(), HashSet.of(' '), false, true);
            }
        } catch (FileNotFoundException e) {
            fail("File not found: " + e.getMessage());
        }
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderCloseLineConsumerWithFileAndSetExtraWordChars() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello.txt", StandardCharsets.UTF_8);
        File file = new File("Hello.txt");
        try (InputStream in = new FileInputStream(file)) {
            LineConsumer out = WordWrap.lineConsumer();
            Set<Character> extraWordChars = HashSet.of(' ');
            String[] lines = {"Hello\nWorld", "FooBar"};
            for (String line : lines) {
                wordWrap.wordWrap(in, out, "\n", 10, extraWordChars::contains, false, true);
            }
        } catch (FileNotFoundException e) {
            fail("File not found: " + e.getMessage());
        }
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderCloseLineConsumerWithSetExtraWordChars() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello.txt", StandardCharsets.UTF_8);
        File file = new File("Hello.txt");
        try (InputStream in = new FileInputStream(file)) {
            LineConsumer out = WordWrap.lineConsumer();
            Set<Character> extraWordChars = HashSet.of(' ');
            String[] lines = {"Hello\nWorld", "FooBar"};
            for (String line : lines) {
                wordWrap.wordWrap(in, out, "\n", 10, e -> true, false, true);
            }
        } catch (FileNotFoundException e) {
            fail("File not found: " + e.getMessage());
        }
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderCloseLineConsumerWithInsertHyphens() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello.txt", StandardCharsets.UTF_8);
        File file = new File("Hello.txt");
        try (InputStream in = new FileInputStream(file)) {
            LineConsumer out = WordWrap.lineConsumer();
            String[] lines = {"Hello\nWorld", "FooBar"};
            for (String line : lines) {
                wordWrap.wordWrap(in, out, "\n", 10, insertHyphens -> true, false, true);
            }
        } catch (FileNotFoundException e) {
            fail("File not found: " + e.getMessage());
        }
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderCloseLineConsumerWithBreakWords() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello.txt", StandardCharsets.UTF_8);
        File file = new File("Hello.txt");
        try (InputStream in = new FileInputStream(file)) {
            LineConsumer out = WordWrap.lineConsumer();
            String[] lines = {"Hello\nWorld", "FooBar"};
            for (String line : lines) {
                wordWrap.wordWrap(in, out, "\n", 10, breakWords -> true, false, true);
            }
        } catch (FileNotFoundException e) {
            fail("File not found: " + e.getMessage());
        }
    }

    @Test
    public void testWordWrap_FromClasspathUtf8_ReaderCloseLineConsumerWithSetExtraWordCharsAndInsertHyphens() {
        WordWrap wordWrap = WordWrap.fromClasspath("Hello.txt", StandardCharsets.UTF_8);
        File file = new File("Hello.txt");
        try (InputStream in = new FileInputStream(file)) {
            LineConsumer out = WordWrap.lineConsumer();
            Set<Character> extraWordChars = HashSet.of(' ');
            String[] lines = {"Hello\nWorld", "FooBar"};
            for (String line : lines) {
                wordWrap.wordWrap(in, out, "\n", 10, e -> true, insertHyphens -> true, false, true);
            }
        } catch (FileNotFoundException e) {
            fail("File not found: " + e.getMessage());
        }
    }

    private static LineConsumer lineConsumer() {
        return new LineConsumer() {
            @Override
            public void start(String line) {
            }

            @Override
            public void end(String line) {
            }

            @Override
            public void print(String line) {
            }
        };
    }

}