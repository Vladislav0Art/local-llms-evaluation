package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrap_reader_out_newLine_maxWidth_stringWidth_extraWordChars_insertHyphens_breakWords {

    @Mock
    private Reader reader;

    @Test
    public void wordWrap_reader_out_newLine_maxWidth_stringWidth_extraWordChars_insertHyphens_breakWords() throws IOException {
        StringBuilder2 out = new StringBuilder2();
        int maxWidth = 10;
        Function<String, Number> stringWidth = Mockito.mock(Function.class);
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;

        when(reader.read()).thenReturn(0);

        WordWrap.wordWrap(reader, out, "", maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);

        assertNotNull(out.value());
    }

}