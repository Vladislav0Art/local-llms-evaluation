package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestWordWrap_FromClasspathUtf8 {

    @BeforeClass
    public static void setUp() {
        Preconditions.checkNotNull(System.getProperty("line.separator"));
    }

    @Test
    public void testWordWrap_FromClasspathUtf8() throws IOException {
        File file = new File("test.txt");
        Preconditions.checkNotNull(file);
        BufferedReader reader = new BufferedReader(new FileInputStream(file));
        Writer out = new OutputStreamWriter(System.out);
        WordWrap wordWrap = fromClasspathUtf8("test.txt", StandardCharsets.UTF_8);
        wordWrap.wordWrap(reader, out, "\n", 1000, s -> 10.0, null, false, true);
        Preconditions.checkNotNull(out);
    }

}