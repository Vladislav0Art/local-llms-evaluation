package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTestWordWrap_single_number {

    private static Builder wordWrapBuilder;

    @BeforeClass
    public static void init() {
        wordWrapBuilder = new WordWrap.Builder();
    }

    @Test
    public void testWordWrap_single_number() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = wordWrapBuilder.toCharSequence().toString().toCharArray();
        assert String.join("\n", result).length() == 1;
    }

}