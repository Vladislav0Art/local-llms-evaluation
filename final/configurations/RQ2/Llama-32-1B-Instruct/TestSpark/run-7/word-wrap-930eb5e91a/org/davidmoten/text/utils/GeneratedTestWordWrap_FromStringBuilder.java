package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestWordWrap_FromStringBuilder {

    @BeforeClass
    public static void setUp() {
        Preconditions.checkNotNull(System.getProperty("line.separator"));
    }

    @Test
    public void testWordWrap_FromStringBuilder() throws IOException {
        StringBuilder2 sb = new StringBuilder2();
        WordWrap wordWrap = from(new CharacterReader(sb));
        wordWrap.wordWrap(sb, System.out, 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(System.out);
    }

}