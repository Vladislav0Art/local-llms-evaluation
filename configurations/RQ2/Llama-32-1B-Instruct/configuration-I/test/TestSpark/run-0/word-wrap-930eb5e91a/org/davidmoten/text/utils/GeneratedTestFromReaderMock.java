package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.Mock;

public class GeneratedTestFromReaderMock {

    @Test
    public void testFromReaderMock() {
        final BufferedReader reader = Mockito.mock(BufferedReader.class);
        final StringBuilder2 wordBuilder = new StringBuilder2(10);
        WordWrap.from(reader, true).wordWrap(wordBuilder, "\n", 100, null, null, null, false, false);
        assertEquals("Hello world\n", wordBuilder.toString());
    }

}