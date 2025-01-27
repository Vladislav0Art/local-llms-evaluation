package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedRightTrim_StringEndingWithCharacterReturnsTrimmedString {

    @Mock
    private java.io.Reader reader;

    @Mock
    private java.io.Writer writer;

    @Mock
    private org.davidmoten.text.utils.LineConsumer lineConsumer;

    @Test
    public void rightTrim_StringEndingWithCharacterReturnsTrimmedString() {
        // Given
        String s = "   abc";
        char c = ' ';
        when(reader.read()).thenReturn(c);

        // When
        String trimmed = WordWrap.rightTrim(s, true);

        // Then
        assertEquals("abc", trimmed);
    }

}