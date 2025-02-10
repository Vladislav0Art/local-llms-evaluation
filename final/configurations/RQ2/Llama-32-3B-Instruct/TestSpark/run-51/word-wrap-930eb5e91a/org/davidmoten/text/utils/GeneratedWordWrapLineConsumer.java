package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedWordWrapLineConsumer {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void wordWrapLineConsumer() throws IOException {
        // Arrange
        Reader in = Mockito.mock(Reader.class);
        LineConsumer out = Mockito.mock(LineConsumer.class);

        // Act and Assert
        WordWrap.wordWrap(in, out, 10L, c -> 5L, new HashSet<>(), false, true);
    }

}