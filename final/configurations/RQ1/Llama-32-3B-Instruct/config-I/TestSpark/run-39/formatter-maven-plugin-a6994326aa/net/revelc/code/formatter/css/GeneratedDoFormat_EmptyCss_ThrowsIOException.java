package net.revelc.code.formatter.css;

public class GeneratedDoFormat_EmptyCss_ThrowsIOException {

    @Test
    public void doFormat_EmptyCss_ThrowsIOException() {
        CssFormatter formatter = new CssFormatter();
        assertThrows(IOException.class, () -> formatter.doFormat("", LineEnding.LF));
    }

}