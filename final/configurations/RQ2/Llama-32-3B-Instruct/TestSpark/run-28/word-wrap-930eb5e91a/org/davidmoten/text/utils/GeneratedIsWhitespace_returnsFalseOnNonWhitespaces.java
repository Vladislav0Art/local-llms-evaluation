package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.davidmoten.text.utils.WordWrap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedIsWhitespace_returnsFalseOnNonWhitespaces {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    @Test
    public void isWhitespace_returnsFalseOnNonWhitespaces() throws IOException {
        // Given

        // When
        boolean result = wordWrap.isWhitespace("test-text");

        // Then
        assertFalse(result);
    }

}