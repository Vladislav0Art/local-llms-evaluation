package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedRightTrim {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void rightTrim() {
        // Arrange
        CharSequence s = "   Hello World";

        // Act and Assert
        assertEquals("Hello World", WordWrap.rightTrim(s));
    }

}