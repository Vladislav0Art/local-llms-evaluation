package org.davidmoten.text.utils;

public class GeneratedTestWordWrapFromCharSequence {

    @Test
    public void testWordWrapFromCharSequence() {
        Preconditions.checkState(!from(new Character[]{}).isPresent());
        Preconditions.checkState(fromUtf8(new FileInputStream("test.txt"), StandardCharsets.UTF_8).isPresent());

        Writer out = new OutputStreamWriter(System.out);
        wordWrap(new InputStreamReader(System.in), out, "\n\n\n", 10, () -> 100L, null, false, true);
        String wrappedText = new StringWriter().toString();
        Preconditions.checkState(wrappedText.equals("Hello World.\nThis is a test."));
    }

}