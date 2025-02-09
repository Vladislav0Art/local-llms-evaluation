package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.util.HashSet;
import java.nio.charset.StandardCharsets;

public class GeneratedFromUtf8Test {

    @Test
    public void fromUtf8Test() {
        assertNotNull(WordWrap.fromUtf8(System.in));
    }

}