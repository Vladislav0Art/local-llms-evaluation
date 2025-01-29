package org.davidmoten.text.utils;

public class GeneratedTestFromInputStreamToFile {

    public static class Reader {
        public int read() {
            return 0;
        }
    }

    public static class IOException {
    }

    @Mock
    private Reader reader;

    @Test
    public void testFromInputStreamToFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new FileOutputStream(File.classpathResource("output.txt")), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

}