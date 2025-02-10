package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedFromUtf8InputStream {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void fromUtf8InputStream() {
        // Arrange
        InputStream in = new FileInputStream(new File("test.txt"));
        when(WordWrap.class.getClassLoader().getResourceAsStream("test.txt")).thenReturn(in);

        // Act and Assert
        WordWrap.Builder builder = WordWrap.fromUtf8(in);
        assertEquals("Hello\nWorld", builder.toString());
    }

}