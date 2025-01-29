package org.davidmoten.text.utils;

public class GeneratedTestWordWrapFromFileWithStream {

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

}