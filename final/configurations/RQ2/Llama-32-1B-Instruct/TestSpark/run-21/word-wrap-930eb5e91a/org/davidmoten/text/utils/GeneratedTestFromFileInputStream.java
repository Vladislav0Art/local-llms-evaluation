package org.davidmoten.text.utils;

public class GeneratedTestFromFileInputStream {

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
    public void testFromFileInputStream() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(new FileInputStream(File.classpathResource("test.txt")), new ByteArrayOutputStream(), "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

}