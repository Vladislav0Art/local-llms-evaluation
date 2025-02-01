package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;

import org.davidmoten.text.utils.WordWrap;

public class GeneratedWrapToListTest {

    @Test
    public void wrapToListTest() {
        StringReader reader = new StringReader("Test Text");
        assertEquals(Arrays.asList("Test Text"), WordWrap.from(reader).wrapToList());
    }

}