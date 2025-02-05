package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import static org.junit.Assert.*;

public class GeneratedFromWithCharSequenceTest {

    @Test
    public void fromWithCharSequenceTest() {
        CharSequence text = "Hello world.";
        assertNotNull(WordWrap.from(text));
    }

}