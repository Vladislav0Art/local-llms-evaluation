package org.davidmoten.text.utils;

public class GeneratedTestLeftTrim {

    @Mock
    private Reader reader;

    public void testFromReader() {
        when(reader.read()).thenReturn(0);

        wordWrap.from(reader, out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testLeftTrim() {
        when(in.read()).thenReturn(0);

        wordWrap.leftTrim(out.toString());

        assert out.toString().startsWith("Hello");
    }

}