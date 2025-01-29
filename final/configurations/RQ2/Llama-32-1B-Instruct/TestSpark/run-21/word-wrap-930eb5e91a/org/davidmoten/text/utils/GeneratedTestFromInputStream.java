package org.davidmoten.text.utils;

public class GeneratedTestFromInputStream {

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
    public void testFromInputStream() throws IOException {
        when(reader.read()).thenReturn(0);

        wordWrap.from(inputStream, out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

}