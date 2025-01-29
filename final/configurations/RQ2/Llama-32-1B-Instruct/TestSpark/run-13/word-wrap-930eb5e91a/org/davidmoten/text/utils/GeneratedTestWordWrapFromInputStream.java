package org.davidmoten.text.utils;

public class GeneratedTestWordWrapFromInputStream {

    @Test
    public void testWordWrapFromInputStream() {
        Preconditions.checkState(!fromUtf8(new FileInputStream("test.txt"), StandardCharsets.UTF_8).isPresent());
        Preconditions.checkState(from(InputStream.class, "test.txt").isPresent());

        Writer out = new OutputStreamWriter(System.out);
        wordWrap(new InputStreamReader(System.in), out, "\n\n\n", 10, () -> 100L, null, false, true);
        String wrappedText = new StringWriter().toString();
        Preconditions.checkState(wrappedText.equals("Hello World.\nThis is a test."));
    }

}