package org.davidmoten.text.utils;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;

import static junit.framework.TestCase.assertTrue;
import static junit.framework.TestCase.assertEquals;

public class GeneratedCloseTest {

    @Test
    public void closeTest() {
        StringReader reader = new StringReader("Hello, world!");
        WordWrap.close(reader);
    }

}