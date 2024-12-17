package org.jsoup.helper;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class GeneratedTestBuild_EmptyInputUrl_ReturnsTrue {

    private final String inputUrl = "https://example.com";
    private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private PrintStream originalOut = System.out;

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testBuild_EmptyInputUrl_ReturnsTrue() throws UnsupportedEncodingException {
        assertThrows(UnsupportedEncodingException.class, () -> urlBuilder.build());
    }

}