package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedWordWrapReaderWriter {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void wordWrapReaderWriter() throws IOException {
        // Arrange
        when(readerMock.read()).thenReturn(0);
        Writer out = Mockito.mock(Writer.class);

        // Act and Assert
        WordWrap.wordWrap(readerMock, out, "\n", 10L, c -> 5L, new HashSet<>(), false, true);
    }

}