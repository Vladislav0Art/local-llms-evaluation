package org.davidmoten.text.utils;

import org.davidmoten.text.utils.WordWrap;
import org.junit.Test;

import java.io.*;

import static org.junit.Assert.*;

public class GeneratedFromSequenceTest {

    @Test
    public void fromSequenceTest() {
        assertNotNull(WordWrap.from("Test Sequence"));
    }

}