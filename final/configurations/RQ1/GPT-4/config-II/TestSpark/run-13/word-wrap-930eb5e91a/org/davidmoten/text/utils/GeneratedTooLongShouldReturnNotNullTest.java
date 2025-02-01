package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedTooLongShouldReturnNotNullTest {

    @Test
    public void tooLongShouldReturnNotNullTest() throws Exception {
        assertTrue(WordWrap.tooLong(null, null, 0));
    }

}