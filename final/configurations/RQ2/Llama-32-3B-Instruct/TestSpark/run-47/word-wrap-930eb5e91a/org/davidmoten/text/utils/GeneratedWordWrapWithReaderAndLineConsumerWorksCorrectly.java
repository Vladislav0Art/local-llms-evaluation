package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedWordWrapWithReaderAndLineConsumerWorksCorrectly {

    @Test
    public void wordWrapWithReaderAndLineConsumerWorksCorrectly() throws IOException {
        Reader in = Mockito.mock(Reader.class);
        LineConsumer out = Mockito.mock(LineConsumer.class);
        Number maxWidth = 10;
        Function<? super CharSequence, ? extends Number> stringWidth = Mockito.mock(Function.class);
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        WordWrap.wordWrap(in, out, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
    }

}