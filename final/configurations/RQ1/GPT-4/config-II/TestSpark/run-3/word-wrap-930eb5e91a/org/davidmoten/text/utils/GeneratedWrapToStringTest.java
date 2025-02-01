package org.davidmoten.text.utils;

import org.junit.Test;
import org.davidmoten.text.utils.WordWrap;

import java.io.StringReader;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class GeneratedWrapToStringTest {

    @Test
    public void wrapToStringTest() {
        String wrappedText = WordWrap.from("One Two Three Four Five Six").wrap();
        assertEquals("One Two Three Four Five Six", wrappedText);
    }

}