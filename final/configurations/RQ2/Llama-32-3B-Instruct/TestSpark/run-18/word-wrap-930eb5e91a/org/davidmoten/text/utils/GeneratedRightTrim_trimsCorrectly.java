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

public class GeneratedRightTrim_trimsCorrectly {

    @Test
    public void rightTrim_trimsCorrectly() {
        // given
        CharSequence text = new StringBuilder("   hello world  ");

        // when
        CharSequence trimmedText = WordWrap.rightTrim(text);

        // then
        assertTrue(trimmedText.equals(new StringBuilder("hello world")));
    }

}