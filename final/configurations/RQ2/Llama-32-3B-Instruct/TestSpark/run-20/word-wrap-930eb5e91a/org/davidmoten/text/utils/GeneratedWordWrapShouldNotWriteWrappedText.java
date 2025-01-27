package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrapShouldNotWriteWrappedText {

    @Mock
    private BufferedReader bufferedReader;

    @Mock
    private Writer writer;

    @Test
    public void wordWrapShouldNotWriteWrappedText() throws IOException {
        // Arrange
        Preconditions.checkState(writer != null);

        when(stringWidth.apply("hello world")).thenReturn(13L);
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = false;
        boolean breakWords = true;

        // Act
        WordWrap.wordWrap(bufferedReader, writer, "\n", 80, stringWidth, extraWordChars, insertHyphens, breakWords);

        // Assert
        assertEquals("hello world", writer.toString());
    }

}