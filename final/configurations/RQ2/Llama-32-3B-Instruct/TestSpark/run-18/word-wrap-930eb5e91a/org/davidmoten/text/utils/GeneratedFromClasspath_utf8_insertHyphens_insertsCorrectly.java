package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Set;

public class GeneratedFromClasspath_utf8_insertHyphens_insertsCorrectly {

    @Test
    public void fromClasspath_utf8_insertHyphens_insertsCorrectly() throws IOException {
        // given
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("test.txt");
        boolean insertHyphens = true;

        // when
        List<String> words = builder.getWords();

        // then
        assertTrue(words.contains("hello-world"));
    }

}