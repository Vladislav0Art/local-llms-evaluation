package net.revelc.code.formatter.css;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedBuildFormatter_InvalidIndent_ThrowsIOException {

    @Test
    public void buildFormatter_InvalidIndent_ThrowsIOException() {
        assertThrows(IOException.class, () -> new CssFormatterBuilder().build(Map.of()));
    }
}

class CssFormatterBuilder {

    private int indent;

    public CssFormatterBuilder setIndent(int indent) {
        this.indent = indent;
        return this;
    }

    public CssFormatter build(Map<String, String> options) throws IOException {
        var formatter = new CssFormatter();
        formatter.init(options, null);
        return formatter;
    }

}