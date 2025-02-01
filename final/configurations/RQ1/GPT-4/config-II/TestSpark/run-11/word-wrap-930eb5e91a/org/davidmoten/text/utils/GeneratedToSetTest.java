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

public class GeneratedToSetTest {

    @Test
    public void toSetTest() {
        Set<Character> result = WordWrap.toSet("abcdef");
        assertTrue(result.contains('a'));
        assertTrue(result.contains('b'));
        assertTrue(result.contains('c'));
        assertTrue(result.contains('d'));
        assertTrue(result.contains('e'));
        assertTrue(result.contains('f'));
    }

}