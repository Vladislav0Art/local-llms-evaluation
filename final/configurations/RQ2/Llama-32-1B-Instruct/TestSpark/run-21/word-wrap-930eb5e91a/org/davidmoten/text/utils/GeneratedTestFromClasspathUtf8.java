package org.davidmoten.text.utils;

public class GeneratedTestFromClasspathUtf8 {

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
    public void testFromClasspathUtf8() {
        when(reader.read()).thenReturn(0);

        wordWrap.fromClasspathUtf8("test.txt", StandardCharsets.UTF_8);
        assert out.toString().contains("Hello\nWorld");
    }

}