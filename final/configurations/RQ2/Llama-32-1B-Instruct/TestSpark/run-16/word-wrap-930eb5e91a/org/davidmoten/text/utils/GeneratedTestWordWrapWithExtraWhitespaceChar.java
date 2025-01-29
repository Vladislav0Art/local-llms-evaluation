package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestWordWrapWithExtraWhitespaceChar {

    @Test
    public void testWordWrapWithExtraWhitespaceChar() {
        Reader reader = new InputStreamReader(System.in);
        StringBuilder word = new StringBuilder();
        char[] buffer = new char[1024];
        int len = 0;
        while ((len = reader.read(buffer)) != -1) {
            String line = new String(buffer, 0, len).trim();
            if (line.length() > WordWrap.this.maxWidth) {
                word.append("\n").append(line);
            } else {
                word.append(line);
            }
        }

        CharSet charset = StandardCharsets.UTF_8;
        Writer out = new OutputStreamWriter(System.out);

        assertTrue(WordWrap.wordWrap(reader, out, WordWrap.this.maxWidth, null, (s) -> s.length() * 1.5f, null, word::length, HashSet.of(), false, true).length() > 0);
    }

}