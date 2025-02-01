package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.Writer;

import static org.junit.Assert.*;

public class GeneratedFromCharsequenceTest {

    @Test
    public void fromCharsequenceTest() {
        CharSequence text = "test";
        WordWrap.Builder result = WordWrap.from(text);
        assertNotNull(result);
    }

}