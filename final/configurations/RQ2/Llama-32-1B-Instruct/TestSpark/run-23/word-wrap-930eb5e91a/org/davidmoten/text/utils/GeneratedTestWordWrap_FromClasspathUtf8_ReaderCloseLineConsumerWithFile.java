package org.davidmoten.text.utils;

public class GeneratedTestWordWrap_FromClasspathUtf8_ReaderCloseLineConsumerWithFile {

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

}