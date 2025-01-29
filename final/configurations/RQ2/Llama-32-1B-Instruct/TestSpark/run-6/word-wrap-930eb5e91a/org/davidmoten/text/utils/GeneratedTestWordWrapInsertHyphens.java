package org.davidmoten.text.utils;

public class GeneratedTestWordWrapInsertHyphens {

    @Test
    public void testWordWrapInsertHyphens() {
        Reader reader = new InputStreamReader(new FileInputStream("input.txt"), StandardCharsets.UTF_8);
        Writer out = new OutputStreamWriter(new FileOutputStream("output.txt"));
        WordWrap.Builder.from(reader, true).wordWrap(out, "Hello World", "\n", 10, Function.identity(), null, false, true);
        new File("output.txt").delete();
    }

}