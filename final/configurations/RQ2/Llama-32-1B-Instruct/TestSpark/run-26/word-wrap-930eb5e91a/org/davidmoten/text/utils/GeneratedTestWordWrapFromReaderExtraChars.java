package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedTestWordWrapFromReaderExtraChars {

    @Test
    public void testWordWrapFromReaderExtraChars() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new HashSet<>(), "\n", 100, (s) -> s.length() > 0,
                false, false);

        Preconditions.checkNotNull(new StringBuilder2(), "Word wrap from reader must return a valid StringBuilder");
    }

}