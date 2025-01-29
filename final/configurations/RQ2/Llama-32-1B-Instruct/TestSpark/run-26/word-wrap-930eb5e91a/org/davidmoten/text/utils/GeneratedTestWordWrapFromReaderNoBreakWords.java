package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedTestWordWrapFromReaderNoBreakWords {

    @Test
    public void testWordWrapFromReaderNoBreakWords() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new StringBuilder2(), "\n", 100, (s) -> s.length() > 0,
                null, false, true);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

}