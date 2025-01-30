package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        WordWrap.Builder builder = WordWrap.from("line with more than 80 characters line with more than 80 characters line with more than 80 characters");
        String wrap = builder.wrap();
        assertEquals(wrap, "line with more than 80 characters line with more than 80 characters line with more");
    }

    private Set<Character> toSet(String chars) {
        Set<Character> set = new HashSet<>();
        for (char c : chars.toCharArray()) {
            set.add(c);
        }
        return set;
    }

}