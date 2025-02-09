package org.davidmoten.text.utils;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.function.Function;
import java.io.BufferedReader;
import java.io.IOException;

public class GeneratedCloseTest {

    @Test
    public void closeTest() {
        StringReader reader = new StringReader("Test data");
        WordWrap.close(reader);
    }

}