package org.davidmoten.text.utils;

import com.github.davidmoten.guavamini.Preconditions;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Set;

public class GeneratedTest {

    @Mock
    private Reader reader;

    @Mock
    private LineConsumer lineConsumer;

    @Mock
    private Writer writer;

    @VisibleForTesting
    private static Builder builder = new Builder();

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("org.davidmoten.text.utils.WordWrapTest");
    }

    @Test
    public void fromReader_returnBuilder() {
        Preconditions.checkTrue(WordWrap.from(reader).isPresent());
    }

    @Test
    public void fromClasspathUtf8_resourceResource_returnBuilder() {
        Preconditions.checkTrue(builder.build().getNewLine().equals("\n"));
    }

    @Test
    public void fromClasspath_utf8_returnsBuilder() {
        Preconditions.checkTrue(builder.build().getMaxWidth().equals(80));
    }

    @Test
    public void fromUTF8_streamStream_returnBuilder() {
        Preconditions.checkTrue(builder.build().getNewLine().equals("\n"));
    }

    @Test
    public void wordWrap_reader_writer_newline_maxWidth_stringWidth_extraWordChars_insertHyphens_breakWords_throwsIOException() {
        Preconditions.checkThrowing(WordWrap.wordWrap(reader, writer, "\n", 80, (s) -> 30L, new HashSet<>(), false, true), IOException.class);
    }

    @Test
    public void wordWrap_reader_lineConsumer_newline_maxWidth_stringWidth_extraWordChars_insertHyphens_breakWords_throwsIOException() {
        Preconditions.checkThrowing(WordWrap.wordWrap(reader, lineConsumer, 80, (s) -> 30L, new HashSet<>(), false, true), IOException.class);
    }

    @Test
    public void rightTrim_returnsEmptyStringWhenInputIsEmpty() {
        assertEquals("", WordWrap.rightTrim(""));
    }

    @Test
    public void rightTrim_rightTrimsString() {
        assertEquals(" ", WordWrap.rightTrim("   "));
    }

    @Test
    public void isWhitespace_returnsFalseWhenInputIsNotWhitespace() {
        assertEquals(false, WordWrap.isWhitespace("a"));
    }

    @Test
    public void isWhitespace_returnsTrueWhenInputIsWhitespace() {
        assertEquals(true, WordWrap.isWhitespace(" "));
    }

    @Test
    public void leftTrim_trimsLeftSideOfStringBuilder2() {
        assertEquals("", WordWrap.leftTrim(new StringBuilder2()));
    }
}

class LineConsumer {
}

}