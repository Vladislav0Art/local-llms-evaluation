package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedFromFileWithCharsetShouldReturnBuilder {

    @Test
    public void fromFileWithCharsetShouldReturnBuilder() {
        WordWrap.Builder builder = WordWrap.from(new File("test.txt"), StandardCharsets.UTF_8);
        assertNotNull(builder);
    }
}

class WordWrapLineConsumer implements WordWrap.LineConsumer {
    private StringBuilder2 content;

    public WordWrapLineConsumer(StringBuilder2 content) {
        this.content = content;
    }

    @Override
    public void accept(CharSequence s) throws IOException {
        content.append(s).append("\n");
    }

    public String toString() {
        return content.toString();
    }
}

class WordWrapWriter implements WordWrap.Writer {
    private StringBuilder line;

    public WordWrapWriter(StringBuilder line, int maxWidth) {
        this.line = line;
    }

    @Override
    public void accept(CharSequence s) throws IOException {
        if (line.length() + s.length() > maxWidth) {
            out(line.toString());
            line.setLength(0);
        }
        line.append(s);
    }

    @Override
    public void close() throws IOException {
    }

    private static WordWrap.Writer writer(StringBuilder2 line, int maxWidth) {
        return new WordWrap.Writer(line, maxWidth);
    }

}