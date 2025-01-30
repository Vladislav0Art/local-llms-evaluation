package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.StringReader;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedWrapTest {

    @Test
    public void wrapTest() {
        String result = WordWrap.from("This is a sample text.").wrap();
        assertTrue(result instanceof String);
    }

}