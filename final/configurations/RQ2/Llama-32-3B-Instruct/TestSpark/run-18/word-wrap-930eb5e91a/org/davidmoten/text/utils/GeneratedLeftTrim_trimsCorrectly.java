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

public class GeneratedLeftTrim_trimsCorrectly {

    @Test
    public void leftTrim_trimsCorrectly() {
        // given
        StringBuilder word = new StringBuilder("   hello world  ");

        // when
        WordWrap.leftTrim(word);

        // then
        assertEquals(new StringBuilder("hello world"), word);
    }

}