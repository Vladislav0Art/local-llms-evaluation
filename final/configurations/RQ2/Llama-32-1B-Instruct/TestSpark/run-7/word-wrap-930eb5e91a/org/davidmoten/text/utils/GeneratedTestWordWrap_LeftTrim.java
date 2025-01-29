package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestWordWrap_LeftTrim {

    @BeforeClass
    public static void setUp() {
        Preconditions.checkNotNull(System.getProperty("line.separator"));
    }

    @Test
    public void testWordWrap_LeftTrim() throws IOException {
        String[] words = {"this", "is", "a", "test"};
        WordWrap wordWrap = new WordWrap();
        for (String word : words) {
            wordWrap.leftTrim(word);
        }
        Preconditions.checkNotNull(System.out);
    }

}