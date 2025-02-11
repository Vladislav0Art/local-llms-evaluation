package net.revelc.code.formatter.css;

public class GeneratedDoFormat_InvalidCss_ThrowsIOException {

    @Test
    public void doFormat_InvalidCss_ThrowsIOException() {
        CssFormatter formatter = new CssFormatter();
        assertThrows(IOException.class, () -> formatter.doFormat("{ invalid css }", LineEnding.LF));
    }
}

class CssFormatterBuilder {

    private int indent;

    public void setIndent(int indent) {
        this.indent = indent;
    }

    public CssFormatter build(Map<String, String> options) throws IOException {
        if (indent > 0) {
            throw new IOException("Invalid indent");
        }
        return new CssFormatter();
    }
}

}