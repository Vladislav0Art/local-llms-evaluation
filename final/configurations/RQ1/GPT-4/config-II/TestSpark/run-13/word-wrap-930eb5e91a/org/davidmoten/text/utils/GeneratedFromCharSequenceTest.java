package org.davidmoten.text.utils;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.*;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder result = WordWrap.from("test");

        assertNotNull(result);
    }

}