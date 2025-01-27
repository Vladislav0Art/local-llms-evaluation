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

public class GeneratedFromClasspathUtf8_singleResourceReturnSingleWordBuilder {

    @Test
    public void fromClasspathUtf8_singleResourceReturnSingleWordBuilder() {
        // given
        WordWrap.Builder builder = WordWrap.fromClasspathUtf8("hello");

        // when
        boolean hasMoreWords = builder.hasMoreWords();

        // then
        assertTrue(hasMoreWords);
    }

}