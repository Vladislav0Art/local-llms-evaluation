package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratedTest {

    private static Builder wordWrapBuilder;

    @BeforeClass
    public static void init() {
        wordWrapBuilder = new WordWrap.Builder();
    }

    @Test
    public void testWordWrap_empty_string() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, out, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = out.toString().toCharArray();
        assert String.join("\n", result).length() == 1000;
    }

    @Test
    public void testWordWrap_whitespace() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, out, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = out.toString().toCharArray();
        for (char c : result) {
            assert ' ' == c;
        }
    }

    @Test
    public void testWordWrap_just_whitespace() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, out, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = out.toString().toCharArray();
        assert String.join("\n", result).length() == 1000;
    }

    @Test
    public void testWordWrap_empty_line() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, out, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = out.toString().toCharArray();
        assert String.join("\n", result).length() == 1000;
    }

    @Test
    public void testWordWrap_single_word() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = wordWrapBuilder.toCharSequence().toString().toCharArray();
        assert String.join("\n", result).length() == 1;
    }

    @Test
    public void testWordWrap_multiple_words() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = wordWrapBuilder.toCharSequence().toString().toCharArray();
        assert String.join("\n", result).length() == 2;
    }

    @Test
    public void testWordWrap_just_numbers() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = out.toString().toCharArray();
        assert String.join("\n", result).length() == 1000;
    }

    @Test
    public void testWordWrap_single_number() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = wordWrapBuilder.toCharSequence().toString().toCharArray();
        assert String.join("\n", result).length() == 1;
    }

    @Test
    public void testWordWrap_multiple_numbers() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = wordWrapBuilder.toCharSequence().toString().toCharArray();
        assert String.join("\n", result).length() == 2;
    }

    @Test
    public void testWordWrap_empty_file() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
        StringBuilder out = new StringBuilder();
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = out.toString().toCharArray();
        assert String.join("\n", result).length() == 1000;
    }

    @Test
    public void testWordWrap_single_file() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
        wordWrapBuilder.from(reader, "\n", 1000L, (s) -> s.length(), null, false, true);
        char[] result = wordWrapBuilder.toCharSequence().toString().toCharArray();
        assert String.join("\n", result).length() == 1;
    }

}