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

public class GeneratedIncludeExtraWordCharsTest {

    @Test
    public void includeExtraWordCharsTest() {
        Builder builder = WordWrap.from("test");
        builder.includeExtraWordChars("word");
        assertEquals(builder.extraWordChars, new HashSet(Arrays.asList('\"', 't', '\'', '\u2018', '\u2019', '\u201C', 't', '\u201D', '?', 'e', ',', '/', ':', '_', 'w', 'o', 'r', 'd')));
    }

}