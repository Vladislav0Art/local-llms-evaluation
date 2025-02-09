package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedFromFileTest {

    @Test
    public void fromFileTest() {
        assertNotNull(WordWrap.from(new File("test.txt"), StandardCharsets.UTF_8));
    }

}