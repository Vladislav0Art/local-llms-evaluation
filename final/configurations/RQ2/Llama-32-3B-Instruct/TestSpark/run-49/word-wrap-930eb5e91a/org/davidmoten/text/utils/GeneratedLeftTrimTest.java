package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class GeneratedLeftTrimTest {

    @Test
    public void leftTrimTest() {
        StringBuilder word = new StringBuilder("   Hello   ");
        Preconditions.assertEquals("Hello", WordWrap.leftTrim(word));
    }
}

class MockReader implements java.io.Reader {
    private List<String> words;
    private int cursor;

    public MockReader(List<String> words) {
        this.words = words;
    }

    @Override
    public int read() throws IOException {
        if (cursor >= words.size()) {
            return -1;
        }
        String word = words.get(cursor);
        cursor++;
        return word.indexOf('\n') != -1 ? word.substring(0, word.indexOf('\n')).length() : word.length();
    }

    @Override
    public int read(char[] cbuf) throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override
    public long skip(long n) throws IOException {
        throw new UnsupportedOperationException();
    }
}

class LineConsumer {
    private StringBuilder buffer = new StringBuilder();

    public void consume(String line) {
        buffer.append(line).append("\n");
    }

    public String getResult() {
        return buffer.toString().trim();
    }

}