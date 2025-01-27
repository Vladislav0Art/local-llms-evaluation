package org.davidmoten.text.utils;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class GeneratedWordWrapReaderLineConsumerNumberFunctionSetCharSetInsertHyphensBreakWords {

    @Test
    public void wordWrapReaderLineConsumerNumberFunctionSetCharSetInsertHyphensBreakWords() {
        // given
        Reader in = new BufferedReader(new InputStreamReader("test text"));
        LineConsumer out = new StringWriter();
        Number maxWidth = 10;
        Function<String, Number> stringWidth = (s) -> s.length();
        Set<Character> extraWordChars = new HashSet<>();
        boolean insertHyphens = true;
        boolean breakWords = false;

        // when
        WordWrap.wordWrap(in, out, maxWidth, stringWidth, extraWordChars, insertHyphens, breakWords);

        // then
        String writtenText = out.toString();
        assertThat(writtenText, is("first\nsecond"));
    }

}