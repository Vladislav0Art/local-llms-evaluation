package org.davidmoten.text.utils;

public class GeneratedTestFromCharSet {

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
    public void testFromCharSet() {
        when(reader.read()).thenReturn(0);

        wordWrap.fromClasspathUtf8("test.txt", charset);
        assert out.toString().contains("Hello\nWorld");
    }

}