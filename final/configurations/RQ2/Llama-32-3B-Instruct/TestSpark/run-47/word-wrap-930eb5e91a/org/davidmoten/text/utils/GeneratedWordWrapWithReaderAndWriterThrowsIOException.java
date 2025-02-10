package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedWordWrapWithReaderAndWriterThrowsIOException {

    @Test
    public void wordWrapWithReaderAndWriterThrowsIOException() throws IOException {
        Reader in = Mockito.mock(Reader.class);
        Writer out = Mockito.mock(Writer.class);
        String newLine = "\n";
        Number maxWidth = 10;
        Function<? super CharSequence, ? extends Number> stringWidth = Mockito.mock(Function.class);
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        try {
            WordWrap.wordWrap(in, out, newLine, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
            assert false : "Expected an IOException";
        } catch (IOException e) {
            // expected
        }
    }

}