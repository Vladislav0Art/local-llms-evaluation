package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestWordWrap_FromStreamUtf8 {

    @BeforeClass
    public static void setUp() {
        Preconditions.checkNotNull(System.getProperty("line.separator"));
    }

    @Test
    public void testWordWrap_FromStreamUtf8() throws IOException {
        InputStream in = System.in;
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));
        OutputStreamWriter out = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
        WordWrap wordWrap = fromUtf8("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

}