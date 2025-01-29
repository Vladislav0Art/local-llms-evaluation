package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedTestWordWrapFromReaderNoExtraChars {

    @Test
    public void testWordWrapFromReaderNoExtraChars() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        Preconditions.checkNotNull(new HashSet<>(), "HashSet of extra chars cannot be null");

        WordWrap.from(new BufferedReader(new InputStreamReader(
                        new FileInputStream("test.txt"))), new HashSet<>(),
                "\n", 100, (s) -> s.length() > 0,
                false, false);

        Preconditions.checkNotNull(new StringBuilder2(), "Word wrap from reader must return a valid StringBuilder");
    }

}