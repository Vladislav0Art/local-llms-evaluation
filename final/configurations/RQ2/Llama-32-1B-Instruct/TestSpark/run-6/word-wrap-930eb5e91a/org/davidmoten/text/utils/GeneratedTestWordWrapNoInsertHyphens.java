package org.davidmoten.text.utils;

public class GeneratedTestWordWrapNoInsertHyphens {

    @Test
    public void testWordWrapNoInsertHyphens() {
        Reader reader = new InputStreamReader(new FileInputStream("input.txt"), StandardCharsets.UTF_8);
        Writer out = new OutputStreamWriter(new FileOutputStream("output.txt"));
        WordWrap.Builder.from(reader, true).wordWrap(out, "Hello World", "\n", 10, null, null, false, false);
        new File("output.txt").delete();
    }

}