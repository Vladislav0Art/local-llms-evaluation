package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedFromReaderWithoutCloseTest {

    @Test
    public void fromReaderWithoutCloseTest() {
        StringReader reader = new StringReader("");
        WordWrap.Builder builder = WordWrap.from(reader, false);
        assertEquals("Should return WordWrap builder.", WordWrap.Builder.class, builder.getClass());
    }

}