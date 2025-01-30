package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.File;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GeneratedExcludeExtraWordCharsTest {

    @Test
    public void excludeExtraWordCharsTest() {
        Builder builder = WordWrap.from("test");
        builder.excludeExtraWordChars("chars");
        assertEquals(builder.extraWordChars, new HashSet(Arrays.asList('\"', 't', '\'', '\u2018', '\u2019', '\u201C', '\u201D', '?', ',', '/', ':', '_')));
    }

}