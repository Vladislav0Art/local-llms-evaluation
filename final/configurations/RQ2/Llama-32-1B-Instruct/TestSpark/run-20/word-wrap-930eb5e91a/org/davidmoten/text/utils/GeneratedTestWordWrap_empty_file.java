package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestWordWrap_empty_file {

    private static Builder wordWrapBuilder;

    @BeforeClass
    public static void init() {
        wordWrapBuilder = new WordWrap.Builder();
    }

    @Test
    public void testWordWrap_empty_file() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = out.toString().toCharArray();
        assert String.join("\n", result).length() == 1000;
    }

}