package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestWordWrap_ClosedReader {

    @BeforeClass
    public static void setUp() {
        Preconditions.checkNotNull(System.getProperty("line.separator"));
    }

    @Test
    public void testWordWrap_ClosedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Reader in = from(reader);
        WordWrap wordWrap = from(in, StandardCharsets.UTF_8);
        Preconditions.checkNotNull(wordWrap);
    }

}