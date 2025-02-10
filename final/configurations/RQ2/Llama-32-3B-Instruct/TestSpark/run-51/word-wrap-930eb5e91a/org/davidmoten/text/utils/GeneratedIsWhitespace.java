package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedIsWhitespace {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void isWhitespace() {
        // Arrange
        CharSequence s = "   ";

        // Act and Assert
        assertTrue(WordWrap.isWhitespace(s));
    }

}