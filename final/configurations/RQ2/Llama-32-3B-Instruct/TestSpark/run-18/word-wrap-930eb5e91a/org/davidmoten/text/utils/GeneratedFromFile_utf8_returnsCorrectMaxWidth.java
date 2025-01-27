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

public class GeneratedFromFile_utf8_returnsCorrectMaxWidth {

    @Test
    public void fromFile_utf8_returnsCorrectMaxWidth() throws IOException {
        // given
        File file = new File("test.txt");
        WordWrap.Builder builder = WordWrap.from(file, StandardCharsets.UTF_8);

        // when
        Number maxWidth = builder.getMaxWidth();

        // then
        assertNotNull(maxWidth);
    }

}