package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestBuild_EmptyInputUrl {

    private final String inputUrl = "https://example.com";
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testBuild_EmptyInputUrl() throws UnsupportedEncodingException {
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
    }

}