package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrapReaderLineConsumer {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private File file;

    @Test
    public void wordWrapReaderLineConsumer() throws IOException {
        String newLine = "\n";
        Number maxWidth = 10L;
        Function<CharSequence, Number> stringWidth = (s) -> s.length();
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;
        when(lineConsumer.accept(any())).thenReturn(0);
        WordWrap.wordWrap(reader, lineConsumer, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
    }

}