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

public class GeneratedFromReader_emptyReturnsEmptyBuilder {

    @Test
    public void fromReader_emptyReturnsEmptyBuilder() {
        // given
        WordWrap.Builder builder = WordWrap.from(new StringReader(""));

        // then
        assertNotNull(builder);
        assertTrue(builder.isEmpty());
    }

}