package org.davidmoten.text.utils;

public class GeneratedTestFromClasspath_MultipleLines_Duplication {

    @Test
    public void testFromClasspath_MultipleLines_Duplication() throws IOException {
        String resource = "test.txt";
        Charset charset = StandardCharsets.UTF_8;
        Reader reader = new InputStreamReader(new FileInputStream(new File(resource)), charset);
        Writer out = new OutputStreamWriter(new FileOutputStream("output.txt"), charset);
        WordWrap.fromClasspathUtf8(resource, charset).wordWrap(reader, out, "\n", 20, s -> s.length() > 20, null, setOf('a', 'b'), true, false);
    }

}