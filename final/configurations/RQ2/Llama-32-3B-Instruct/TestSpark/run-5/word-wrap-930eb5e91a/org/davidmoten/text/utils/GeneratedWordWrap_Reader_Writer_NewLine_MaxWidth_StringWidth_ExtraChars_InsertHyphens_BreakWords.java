package org.davidmoten.text.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWordWrap_Reader_Writer_NewLine_MaxWidth_StringWidth_ExtraChars_InsertHyphens_BreakWords {

    @Mock
    private Reader reader;

    public static class Builder {
        // implementation
    }

    @Test
    public void wordWrap_Reader_Writer_NewLine_MaxWidth_StringWidth_ExtraChars_InsertHyphens_BreakWords() throws IOException {
        Reader in = reader;
        Writer out = new StringWriter();
        String newLine = "\n";
        Number maxWidth = 10L;
        Function<CharSequence, Number> stringWidth = mock(Function.class);
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;

        when(reader.read()).thenReturn(0);

        WordWrap.wordWrap(in, out, newLine, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);
    }

}