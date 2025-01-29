package org.davidmoten.text.utils;

public class GeneratedTest {

    @Test
    public void testWordWrapFromReader() {
        Preconditions.checkState(!WordWrap.fromClasspathUtf8("test.txt").isPresent());
        Preconditions.checkState(WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8).isPresent());

        WordWrap.Builder builder = WordWrap.from(new InputStreamReader(System.in));
        try (Writer out = new OutputStreamWriter(builder.out)) {
            wordWrap(in, out, "\n\n\n", 10, () -> 100L, null, false, true);
            String wrappedText = new StringWriter().toString();
            Preconditions.checkState(wrappedText.equals("Hello World.\nThis is a test."));
        }
    }

    @Test
    public void testWordWrapFromClasspath() {
        Preconditions.checkState(!WordWrap.fromClasspathUtf8("test.txt").isPresent());
        Preconditions.checkState(WordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8).isPresent());

        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("test.txt");
        try (Writer out = new OutputStreamWriter(builder.out)) {
            wordWrap(new InputStreamReader(System.in), out, "\n\n\n", 10, () -> 100L, null, false, true);
            String wrappedText = new StringWriter().toString();
            Preconditions.checkState(wrappedText.equals("Hello World.\nThis is a test."));
        }
    }

    @Test
    public void testWordWrapFromFile() {
        Preconditions.checkState(!WordWrap.from(new File("test.txt")).isPresent());
        Preconditions.checkState(WordWrap.fromFile("test.txt", StandardCharsets.UTF_8).isPresent());

        WordWrap.Builder builder = WordWrapFromFile("test.txt");
        try (Writer out = new OutputStreamWriter(builder.out)) {
            wordWrap(new InputStreamReader(System.in), out, "\n\n\n", 10, () -> 100L, null, false, true);
            String wrappedText = new StringWriter().toString();
            Preconditions.checkState(wrappedText.equals("Hello World.\nThis is a test."));
        }
    }

    @Test
    public void testWordWrapFromFileWithStream() {
        Preconditions.checkState(!WordWrap.from(new File("test.txt")).isPresent());
        Preconditions.checkState(WordWrapFromFile(new File("test.txt"), StandardCharsets.UTF_8).isPresent());

        WordWrap.Builder builder = WordWrapFromFile(new File("test.txt"));
        try (Writer out = new OutputStreamWriter(builder.out)) {
            wordWrap(new InputStreamReader(System.in), out, "\n\n\n", 10, () -> 100L, null, false, true);
            String wrappedText = new StringWriter().toString();
            Preconditions.checkState(wrappedText.equals("Hello World.\nThis is a test."));
        }
    }

    @Test
    public void testWordWrapFromFileWithStreamAndClose() {
        Preconditions.checkState(!WordWrap.from(new File("test.txt")).isPresent());
        Preconditions.checkState(WordWrapFromFile(new File("test.txt"), StandardCharsets.UTF_8).isPresent());

        WordWrap.Builder builder = new WordWrapBuilder();
        try (Writer out = new OutputStreamWriter(builder.out)) {
            wordWrap(new InputStreamReader(System.in), out, "\n\n\n", 10, () -> 100L, null, false, true);
            String wrappedText = new StringWriter().toString();
            Preconditions.checkState(wrappedText.equals("Hello World.\nThis is a test."));
        }
    }

}

class WordWrapBuilder {
    private final StringBuilder wrappedText;

    public WordWrapBuilder() {
        this.wrappedText = new StringBuilder();
    }

    @Override
    public void close() {
    }

    public String getWrappedText() {
        return wrappedText.toString();
    }

    public void wordWrap(InputStream in, Writer out, String line, int spaceLimit) throws IOException {
        char[] chars = (line + " ").toCharArray();

        for (int i = 0; i < Math.min(chars.length, spaceLimit); i++) {
            if (i > 0 && !isSpaceInChars(chars[i - 1], chars[i])) {
                out.write(' ');
            }
            out.write(chars[i]);
        }

        if (chars.length == spaceLimit) {
            for (int i = Math.min(spaceLimit, chars.length); i > 0; i--) {
                out.write(' ');
            }
        }
    }

    private boolean isSpaceInChars(char c, char nextChar) {
        return Character.isWhitespace(c) || Character.isWhitespace(nextChar);
    }

}

class WordWrapFromFile implements WordWrap {
    private final String filePath;

    public WordWrapFromFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public StringBuilder getWrappedText() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            return new StringBuilder();
        }
    }
}

class WordWrapFromFileStream implements WordWrap {
    private final InputStream inputStream;

    public WordWrapFromFileStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public StringBuilder getWrappedText() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            return new StringBuilder();
        }
    }
}

class WordWrapBuilder {
    private final List<String> lines;

    public WordWrapBuilder(List<String> lines) {
        this.lines = lines;
    }

    @Override
    public String getWrappedText() throws IOException {
        StringBuilder wrappedText = new StringBuilder();

        for (String line : lines) {
            wordWrap(new FileInputStream(line), out, line, 0);
            wrappedText.append("\n");
        }

        if (lines.isEmpty()) {
            return "";
        } else {
            try {
                return wrappedText.toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void close() {
    }

    public String wordWrap(InputStream in, Writer out, String line, int spaceLimit) throws IOException {
        char[] chars = (line + " ").toCharArray();

        for (int i = 0; i < Math.min(chars.length, spaceLimit); i++) {
            if (i > 0 && !isSpaceInChars(chars[i - 1], chars[i])) {
                out.write(' ');
            }
            out.write(chars[i]);
        }

        if (chars.length == spaceLimit) {
            for (int i = Math.min(spaceLimit, chars.length); i > 0; i--) {
                out.write(' ');
            }
        }

        return new String(out.toByteArray());
    }

    private boolean isSpaceInChars(char c, char nextChar) {
        return Character.isWhitespace(c) || Character.isWhitespace(nextChar);
    }
}

class WordWrapFromFile implements WordWrap {
    private final String filePath;

    public WordWrapFromFile(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public StringBuilder getWrappedText() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            return new StringBuilder();
        }
    }
}

class WordWrapFromFileStream implements WordWrap {
    private final InputStream inputStream;

    public WordWrapFromFileStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public StringBuilder getWrappedText() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            return new StringBuilder();
        }
    }

}