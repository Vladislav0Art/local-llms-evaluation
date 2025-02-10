package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class GeneratedFromFile {

    @Mock
    public Reader readerMock;

    @Mock
    public Writer writerMock;

    @Test
    public void fromFile() {
        // Arrange
        File file = new File("test.txt");
        when(WordWrap.class.getClassLoader().getResource(file.getName())).thenReturn(new File(file));

        // Act and Assert
        WordWrap.Builder builder = WordWrap.from(file);
        assertEquals("Hello\nWorld", builder.toString());
    }

}