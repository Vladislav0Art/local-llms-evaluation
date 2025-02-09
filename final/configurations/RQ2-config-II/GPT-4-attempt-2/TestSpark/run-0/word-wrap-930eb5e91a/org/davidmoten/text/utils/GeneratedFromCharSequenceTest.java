package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        assertNotNull(WordWrap.from("This is a unit test"));
    }

}