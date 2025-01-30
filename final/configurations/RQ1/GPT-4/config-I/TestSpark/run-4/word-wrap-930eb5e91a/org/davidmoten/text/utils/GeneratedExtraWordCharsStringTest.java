package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;

import java.io.Reader;
import java.io.StringReader;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedExtraWordCharsStringTest {

    @Test
    public void extraWordCharsStringTest() {
        Reader reader = new StringReader("test");
        Builder builder = WordWrap.from(reader).extraWordChars("test");
        assertNotNull(builder);
    }

}