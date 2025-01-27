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

public class GeneratedFromReader_singleWordReturnSingleWordBuilder {

    @Test
    public void fromReader_singleWordReturnSingleWordBuilder() {
        // given
        WordWrap.Builder builder = WordWrap.from(new StringReader("hello"));

        // when
        boolean hasMoreWords = builder.hasMoreWords();

        // then
        assertTrue(hasMoreWords);
    }

}