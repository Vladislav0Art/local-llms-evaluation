package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;

import static org.junit.Assert.*;
import static com.github.davidmoten.guavamini.Preconditions.checkArgument;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        String text = "Hello World";
        WordWrap.Builder builder = WordWrap.from(text);
        Preconditions.assertState(builder, WordWrap.class, true);
    }

}