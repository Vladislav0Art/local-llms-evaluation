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
public class GeneratedRightTrim_returnsTrimmedText {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    private WordWrap wordWrap = new WordWrap();

    @Test
    public void rightTrim_returnsTrimmedText() {
        // Given
        CharSequence text = "   test-text  ";

        // When
        String result = wordWrap.rightTrim(text);

        // Then
        assertEquals("test-text", result);
    }

}