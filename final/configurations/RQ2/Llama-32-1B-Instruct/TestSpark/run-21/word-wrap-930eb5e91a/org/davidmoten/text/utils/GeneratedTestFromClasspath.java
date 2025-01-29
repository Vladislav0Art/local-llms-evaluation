package org.davidmoten.text.utils;

public class GeneratedTestFromClasspath {

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
    public void testFromClasspath() {
        when(reader.read()).thenReturn(0);

        wordWrap.fromClasspath("test.txt", StandardCharsets.UTF_8);
        assert out.toString().contains("Hello\nWorld");
    }

}