package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspathUtf8_ReaderLineConsumer {

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

}