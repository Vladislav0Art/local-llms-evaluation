package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrapReaderConsumer ReturnsNumber {

    @Test
    public void wordWrapReaderConsumer

    ReturnsNumber() throws IOException {
        // given
        Reader in = new BufferedReader(new InputStreamReader(System.in));
        LineConsumer out = Mockito.mock(LineConsumer.class);
        Number maxWidth = 10L;
        Function<? super CharSequence, ? extends Number> stringWidth = Mockito.mock(Function.class);
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = false;
        boolean breakWords = true;

        // when
        WordWrap.wordWrap(in, out, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);

        // then
        Number result = when(stringWidth.apply("hello world")).thenReturn(10L);
        wordWrapReaderConsumer(in, out, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords, result);
    }

}