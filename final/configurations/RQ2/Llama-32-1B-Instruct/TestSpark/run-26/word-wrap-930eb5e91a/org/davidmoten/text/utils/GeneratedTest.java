package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import org.junit.Test;
import org.mockito.Mock;

public class GeneratedTest {

    @Test
    public void testWordWrapFromReaderNoWhitespace() {
        Preconditions.checkNotNull(new Reader(), "Input reader cannot be null");
        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");

        StringBuilder2 word = new StringBuilder2();
        WordWrap.from(new BufferedReader(new InputStreamReader(
                        new FileInputStream("test.txt"))), word, "\n", 100, (s) -> s.length() > 0,
                false, false);

        Preconditions.checkNotNull(word, "Word wrap from reader must return a valid StringWriter");
    }

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

    @Test
    public void testWordWrapFromReaderExtraChars() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new HashSet<>(), "\n", 100, (s) -> s.length() > 0,
                false, false);

        Preconditions.checkNotNull(new StringBuilder2(), "Word wrap from reader must return a valid StringBuilder");
    }

    @Test
    public void testWordWrapFromReaderNoMaxWidth() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new StringBuilder2(), "\n", 100, (s) -> s.length() > 0,
                null, false, false);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

    @Test
    public void testWordWrapFromReaderNoMaxWidthOrEmpty() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new StringBuilder2(), "\n", 100, (s) -> s.length() > 0,
                null, false, false);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

    @Test
    public void testWordWrapFromReaderNoBreakWords() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new StringBuilder2(), "\n", 100, (s) -> s.length() > 0,
                null, false, true);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

    @Test
    public void testWordWrapFromReaderInsertHyphens() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new StringBuilder2(), "\n", 100, (s) -> s.length() > 0,
                () -> true, false, true);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

    @Test
    public void testWordWrapFromReaderBreakWords() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new StringBuilder2(), "\n", 100, (s) -> s.length() > 0,
                () -> true, false, false);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

    @Test
    public void testWordWrapFromReaderEmptyLine() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new StringBuilder2(), "\n", 100, (s) -> s.length() > 0,
                () -> true, false, false);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

    @Test
    public void testWordWrapFromReaderNoClose() {
        Preconditions.checkNotNull(new BufferedReader(
                new InputStreamReader(new FileInputStream("test.txt"))), "BufferedReader cannot be null");

        WordWrap.from(new BufferedReader(
                        new InputStreamReader(new FileInputStream("test.txt"))),
                new HashSet<>(), "\n", 100, (s) -> s.length() > 0,
                () -> true, false, false);

        Preconditions.checkNotNull(new StringWriter(), "StringWriter cannot be null");
    }

}