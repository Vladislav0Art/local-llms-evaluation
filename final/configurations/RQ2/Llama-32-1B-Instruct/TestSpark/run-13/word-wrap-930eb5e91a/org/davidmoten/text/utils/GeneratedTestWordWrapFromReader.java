package org.davidmoten.text.utils;

public class GeneratedTestWordWrapFromReader {

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

}