package org.davidmoten.text.utils;

public class GeneratedTestFromRightTrim {

    @Mock
    private Reader reader;

    public void testFromReader() {
        when(reader.read()).thenReturn(0);

        wordWrap.from(reader, out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

    @Test
    public void testFromRightTrim() {
        when(in.read()).thenReturn(0);

        wordWrap.wordWrap(in, out, "\n", Number.MAX_VALUE, stringWidthFunction, extraWordChars, false, breakWords -> true);
        assert out.toString().contains("Hello\nWorld");
    }

}