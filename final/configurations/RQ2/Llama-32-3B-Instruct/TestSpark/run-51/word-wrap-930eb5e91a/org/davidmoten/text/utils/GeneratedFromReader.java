package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedFromReader {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void fromReader() {
        // Arrange
        when(readerMock.readLine()).thenReturn("Hello World");

        // Act and Assert
        WordWrap.Builder builder = WordWrap.from(readerMock);
        assertEquals("Hello\nWorld", builder.toString());
    }

}