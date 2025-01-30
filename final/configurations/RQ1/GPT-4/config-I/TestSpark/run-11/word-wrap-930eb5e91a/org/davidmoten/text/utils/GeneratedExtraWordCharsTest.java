package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.davidmoten.text.utils.WordWrap.Builder;
import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.function.Function;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedExtraWordCharsTest {

    @Test
    public void extraWordCharsTest() {
        Builder builder = WordWrap.from(new StringReader("test"))
                .extraWordChars(new HashSet<>(Arrays.asList('!', '@', '#')));
        assertEquals(3, builder.extraWordChars.size());
        assertTrue(builder.extraWordChars.contains('!'));
        assertTrue(builder.extraWordChars.contains('@'));
        assertTrue(builder.extraWordChars.contains('#'));
    }

}