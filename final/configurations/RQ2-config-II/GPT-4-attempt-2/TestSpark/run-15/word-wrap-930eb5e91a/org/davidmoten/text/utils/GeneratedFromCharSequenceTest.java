package org.davidmoten.text.utils;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class GeneratedFromCharSequenceTest {

    @Test
    public void fromCharSequenceTest() {
        WordWrap.Builder builder = WordWrap.from("Test");
        assertEquals(builder.text, "Test");
    }

}