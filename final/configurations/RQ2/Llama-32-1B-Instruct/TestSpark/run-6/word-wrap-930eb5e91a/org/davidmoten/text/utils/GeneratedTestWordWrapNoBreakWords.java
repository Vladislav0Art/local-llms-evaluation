package org.davidmoten.text.utils;

public class GeneratedTestWordWrapNoBreakWords {

    @Test
    public void testWordWrapNoBreakWords() {
        Reader reader = new InputStreamReader(new FileInputStream("input.txt"), StandardCharsets.UTF_8);
        Writer out = new OutputStreamWriter(new FileOutputStream("output.txt"));
        WordWrap.Builder.from(reader, true).wordWrap(out, "Hello World", "\n", 10, null, null, false, true);
        new File("output.txt").delete();
    }

}