package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import com.github.davidmoten.guavamini.annotations.VisibleForTesting;
import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedFromReaderTest {

    @Test
    public void fromReaderTest() {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        WordWrap.Builder builder = WordWrap.from(new StringReader("abc"));
        builder.extraWordChars(set);
        assertEquals("abc", builder.wrap());
    }

}