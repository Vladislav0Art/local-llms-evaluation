package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class GeneratedWordWrapReadLineConsumerTest {

    @Test
    public void wordWrapReadLineConsumerTest() throws IOException {
        StringWriter out = new StringWriter();
        LineConsumer lineConsumer = new LineConsumer() {
            @Override
            public void accept(CharSequence t) throws IOException {
                out.write(t.toString());
                out.write('\n');
            }

            @Override
            public void close() throws IOException {
                out.close();
            }
        };
        WordWrap.wordWrap(new StringReader("Testing wordWrap(Reader, LineConsumer...) method"), lineConsumer, 80, null, null, false, false);
        assertEquals("Testing wordWrap(Reader, LineConsumer...) method\n", out.toString());
    }

}