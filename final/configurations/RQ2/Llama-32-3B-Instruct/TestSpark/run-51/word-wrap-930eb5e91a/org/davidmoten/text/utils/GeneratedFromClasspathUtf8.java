package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedFromClasspathUtf8 {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void fromClasspathUtf8() {
        // Arrange
        String resource = "HelloWorld.txt";
        when(WordWrap.class.getClassLoader().getResource(resource)).thenReturn(new File(resource));

        // Act and Assert
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8(resource);
        assertEquals("Hello\nWorld", builder.toString());
    }

}