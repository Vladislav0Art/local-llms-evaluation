package org.davidmoten.text.utils;

import static org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

public class GeneratedTestHashSetExtraWordChars {

    @Test
    public void testHashSetExtraWordChars() {
        CharacterSet extraWordChars = new CharacterSet();
        assertTrue(extraWordChars instanceof CharacterSet);
        assertFalse(extraWordChars.getExtraWordChars().contains('\n'));
        extraWordChars.getExtraWordChars().add('\n');
        assertTrue(extraWordChars.getExtraWordChars().contains('\n'));
    }
}

public class LineReader implements AutoCloseable {

    private final BufferedReader reader;

    public LineReader(BufferedReader reader) {
        this.reader = reader;
    }

    public boolean readNext() throws IOException {
        String line = reader.readLine();
        if (line != null) {
            return true;
        }
        return false;
    }

    @Override
    public void close() throws IOException {
        reader.close();
    }
}

public class LineWriter implements AutoCloseable {

    private final java.io.Writer writer;

    public LineWriter(java.io.Writer writer) {
        this.writer = writer;
    }

    public void addLine(String line) throws IOException {
        writer.write(line);
        writer.newLine();
    }

    @Override
    public void close() throws IOException {
        writer.close();
    }
}

public class CharacterSet {

    private Set<Character> extraWordChars;

    public CharacterSet() {
        this.extraWordChars = new HashSet<>();
    }

    public Set<Character> getExtraWordChars() {
        return extraWordChars;
    }

}