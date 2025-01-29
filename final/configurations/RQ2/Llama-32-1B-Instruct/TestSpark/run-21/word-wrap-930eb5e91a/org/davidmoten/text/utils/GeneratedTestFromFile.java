package org.davidmoten.text.utils;

public class GeneratedTestFromFile {

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
    public void testFromFile() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(File.classpathResource("test.txt"), out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

}