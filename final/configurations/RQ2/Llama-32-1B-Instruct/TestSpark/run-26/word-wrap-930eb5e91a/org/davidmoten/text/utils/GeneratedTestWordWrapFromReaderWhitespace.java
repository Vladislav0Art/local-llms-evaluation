package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedTestWordWrapFromReaderWhitespace {

    @Test
    public void testWordWrapFromReaderWhitespace() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        StringBuilder2 word = new StringBuilder2();
        WordWrap.from(new BufferedReader(new InputStreamReader(
                        new FileInputStream("test.txt"))), word, "\n", 100, (s) -> s.length() > 0,
                false, false);

        Preconditions.checkNotNull(word, "Word wrap from reader must return a valid StringWriter");
    }

}