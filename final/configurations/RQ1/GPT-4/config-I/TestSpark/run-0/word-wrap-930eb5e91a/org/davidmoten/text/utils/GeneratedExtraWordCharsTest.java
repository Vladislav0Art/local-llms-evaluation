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

public class GeneratedExtraWordCharsTest {

    @Test
    public void extraWordCharsTest() {
        Set<Character> extraWordChars = new HashSet<>();
        extraWordChars.add('t');
        Builder builder = WordWrap.from("test");
        builder.extraWordChars(extraWordChars);
        assertEquals(builder.extraWordChars, extraWordChars);
    }

}